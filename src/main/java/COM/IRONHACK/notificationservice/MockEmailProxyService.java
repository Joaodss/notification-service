package COM.IRONHACK.notificationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("mock-email-service")
public interface MockEmailProxyService {

    @PostMapping("/api/email")
    NotificationMessage sendEmail(NotificationMessage notificationMessage);

}
