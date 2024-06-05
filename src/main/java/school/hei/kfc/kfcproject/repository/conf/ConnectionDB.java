package school.hei.kfc.kfcproject.repository.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
//Injection de dépendaces (parametre toujours FINAL et n'utilise pas @Autowird) OU @RequiredArgsConstructor
public class ConnectionDB {

    private final ConnectionProperties connectionProperties;

    public ConnectionDB(ConnectionProperties connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    @Bean
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                connectionProperties.getUrl(),
                connectionProperties.getUsername(),
                connectionProperties.getPassword()
        );
    }
}
