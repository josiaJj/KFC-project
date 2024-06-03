package school.hei.kfc.kfcproject.repository;

import school.hei.kfc.kfcproject.model.Dish;
import school.hei.kfc.kfcproject.repository.conf.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DishRepository implements CrudOperationsInterface<Dish> {
    @Override
    public List<Dish> findAll() {
        List<Dish> dishList = new ArrayList<>();

        String sql = "select * from \"dish\"";

        try (
                Connection connection = ConnectionDB.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while(resultSet.next()) {
                Dish dish = new Dish();
                dish.setId(resultSet.getInt("id"));
                dish.setDishName(resultSet.getString("dishName"));
                dishList.add(dish);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dishList;
    }
}
