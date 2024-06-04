package school.hei.kfc.kfcproject.repository;

import school.hei.kfc.kfcproject.model.Dish;
import school.hei.kfc.kfcproject.model.Ingredient;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class IngredientRepository implements CrudOperationsInterface<Ingredient> {

    @Override
    public List<Ingredient> findAll() {
        List<Ingredient> ingredientList = new ArrayList<>();

        String sql = "select * from \"ingredient\"";

        try (
                Connection connection = getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while(resultSet.next()) {
                Ingredient ingredient = new Ingredient();
                ingredient.setId(resultSet.getInt("id"));
                ingredient.setName(resultSet.getString("name"));
                ingredient.setNeededQty(resultSet.getFloat("neededQty"));
                ingredient.setUnity(resultSet.getString("unity"));
                ingredient.setUnitPrice(resultSet.getFloat("unitPrice"));
                ingredient.setDishId(resultSet.getInt("dishId"));
                ingredientList.add(ingredient);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ingredientList;
    }
}
