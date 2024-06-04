package school.hei.kfc.kfcproject.repository.conf;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@NoArgsConstructor
@Getter
public class ConnectionProperties {
    private String url;
    private String username;
    private String password;
}
