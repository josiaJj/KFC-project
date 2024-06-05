package school.hei.kfc.kfcproject.repository;

import school.hei.kfc.kfcproject.model.Dish;
import school.hei.kfc.kfcproject.model.Stock;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StockRepository implements CrudOperationsInterface<Stock> {

    @Override
    public List<Stock> findAll() {
        List<Dish> stockList = new ArrayList<>();

        String sql = "select * from \"stock\"";

        try (
                Connection connection = DriverManager.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while(resultSet.next()) {
                Stock stock = new Stock();
                stock.setId(resultSet.getInt("id"));
                stock.setAvailableQty(resultSet.getFloat("availableQty"));
                stockList.add(stock);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return stockList;
    }
}
