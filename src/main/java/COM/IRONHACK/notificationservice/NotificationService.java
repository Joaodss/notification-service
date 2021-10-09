package COM.IRONHACK.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class NotificationService {

    @Autowired
    private UserProxyService proxyService;

    @Autowired
    private MockEmailProxyService mockEmailService;
    public void createMessage(NotificationRequest notificationRequest) {
        List<String> emails = getEmails(getUsers(notificationRequest.getRecipient()));
        for (String email: emails
             ) {NotificationMessage message = new NotificationMessage(notificationRequest.getTitle(), notificationRequest.getBody(), email);
            mockEmailService.sendEmail(message);
        }
    }

    private List<UserDTO> getUsers(Recipient recipient) {
        if (recipient == Recipient.ALL) {
            return proxyService.getAllMembers();
        } else if (recipient == Recipient.COACHES) {
            return proxyService.getAllCoaches();
        } else {
            List<UserDTO> customers = proxyService.getAllMembers();
            customers.removeAll(proxyService.getAllCoaches());
            return customers;
        }
    }

    private List<String> getEmails(List<UserDTO> users){
        List<String> emails = new ArrayList<String>();
        for (UserDTO user:users
             ) {emails.add(user.getEmail());

        } return emails;
}

}