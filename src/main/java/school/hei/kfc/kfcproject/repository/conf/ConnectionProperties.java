package school.hei.kfc.kfcproject.repository.conf;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
public class ConnectionProperties {
    private String url= "jdbc:postgresql://localhost:5432/kfc_db";
    private String username = "postgres";
    private String password = "pl1206JOSIA";;
}
