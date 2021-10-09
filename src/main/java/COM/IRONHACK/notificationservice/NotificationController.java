package COM.IRONHACK.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationController {

  @Autowired
  private NotificationService notificationService;

  @PostMapping("/api/notifications")
  public NotificationRequest createNotificationRequest(@RequestBody NotificationRequest notificationRequest) {
    notificationService.createMessage(notificationRequest);
    return notificationRequest;
  }


}
