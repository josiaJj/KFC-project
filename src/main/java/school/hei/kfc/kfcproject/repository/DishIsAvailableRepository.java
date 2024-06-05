package school.hei.kfc.kfcproject.repository;

import org.springframework.stereotype.Repository;
import school.hei.kfc.kfcproject.model.DishIsAvailable;
import school.hei.kfc.kfcproject.repository.conf.ConnectionDB;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DishIsAvailableRepository implements CrudOperationsInterface<DishIsAvailable> {

    private final ConnectionDB connectionDB;

    DishIsAvailableRepository(ConnectionDB connectionDB) {
        this.connectionDB = connectionDB;
    }
    @Override
    public List<DishIsAvailable> findAll() {
        List<DishIsAvailable> dishIsAvailableList = new ArrayList<>();

        String sql = "select * from \"dishIsAvailable\"";

        try (
                Connection connection = connectionDB.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
                ) {
            while(resultSet.next()) {
                DishIsAvailable dishIsAvailable = new DishIsAvailable();
                dishIsAvailable.setId(resultSet.getInt("id"));
                dishIsAvailable.setAvailable(resultSet.getBoolean("isAvailable"));
                dishIsAvailable.setRestaurantId(resultSet.getInt("restaurantId"));
                dishIsAvailable.setDishId(resultSet.getInt("dishId"));
                dishIsAvailableList.add(dishIsAvailable);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dishIsAvailableList;
    }
}
