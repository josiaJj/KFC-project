package school.hei.kfc.kfcproject.repository.conf;

import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private final ConnectionProperties connectionProperties;

    public ConnectionDB(ConnectionProperties connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    @Bean
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                this.connectionProperties.getUrl(),
                this.connectionProperties.getUsername(),
                this.connectionProperties.getPassword()
        );
    }
}
