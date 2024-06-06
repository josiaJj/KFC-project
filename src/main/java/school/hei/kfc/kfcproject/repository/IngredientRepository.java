package school.hei.kfc.kfcproject.repository;

import school.hei.kfc.kfcproject.model.Dish;
import school.hei.kfc.kfcproject.model.Ingredient;
import school.hei.kfc.kfcproject.repository.conf.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class IngredientRepository implements CrudOperationsInterface<Ingredient> {
    private final ConnectionDB connectionDB;
    public IngredientRepository(ConnectionDB connectionDB) {
        this.connectionDB = connectionDB;
    }
    @Override
    public List<Ingredient> findAll() {
        List<Ingredient> ingredientList = new ArrayList<>();

        String sql = "select * from \"ingredient\"";

        try (
                Connection connection = connectionDB.getConnection();
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
                ingredientList.add(ingredient);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ingredientList;
    }
}
