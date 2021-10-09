package COM.IRONHACK.notificationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient("user-service")
public interface UserProxyService {

        @GetMapping("/api/members")
        List<UserDTO> getAllMembers();

        @GetMapping("/api/coaches")
        List<UserDTO> getAllCoaches();
}

