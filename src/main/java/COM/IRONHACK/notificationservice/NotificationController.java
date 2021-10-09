package COM.IRONHACK.notificationservice;

import org.bouncycastle.cms.Recipient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationController {

    @PostMapping("/api/notifications")
    public NotificationRequest createNotificationRequest(@RequestBody NotificationRequest notificationRequest) {
        return notificationRequest;
    }


}
