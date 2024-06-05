package school.hei.kfc.kfcproject.repository;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import school.hei.kfc.kfcproject.model.Restaurant;
import school.hei.kfc.kfcproject.repository.conf.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository

public class RestaurantRepository implements CrudOperationsInterface<Restaurant> {

    private final ConnectionDB connectionDB;

    public RestaurantRepository(ConnectionDB connectionDB) {
        this.connectionDB = connectionDB;
    }

    @Override
    public List<Restaurant> findAll() {
        List<Restaurant> restaurantList = new ArrayList<>();

        String sql = "select * from \"restaurant\"";

        try (
                Connection connection = connectionDB.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                ) {
            while(resultSet.next()) {
                Restaurant restaurant = new Restaurant();
                restaurant.setId(resultSet.getInt("id"));
                restaurant.setLocation(resultSet.getString("location"));
                restaurantList.add(restaurant);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return restaurantList;
    }
}
