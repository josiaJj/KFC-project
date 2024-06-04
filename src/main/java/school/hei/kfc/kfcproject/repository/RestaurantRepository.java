package school.hei.kfc.kfcproject.repository;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import school.hei.kfc.kfcproject.model.Restaurant;
import school.hei.kfc.kfcproject.repository.conf.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

@Repository
@NoArgsConstructor
public class RestaurantRepository implements CrudOperationsInterface<Restaurant> {

    @Override
    public List<Restaurant> findAll() {
        List<Restaurant> restaurantList = new ArrayList<>();

        String sql = "select * from \"restaurant\"";

        try (
                Connection connection = getConnection();
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
