package COM.IRONHACK.notificationservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationMessage {
    private String title;
    private String body;
    private String recipientEmail;
}
