package school.hei.kfc.kfcproject.repository;

import school.hei.kfc.kfcproject.model.Dish;
import school.hei.kfc.kfcproject.model.Stock;
import school.hei.kfc.kfcproject.repository.conf.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StockRepository implements CrudOperationsInterface<Stock> {
    ConnectionDB connectionDB;
    @Override
    public List<Stock> findAll() {
        List<Stock> stockList = new ArrayList<>();

        String sql = "select * from \"stock\"";

        try (
                Connection connection = connectionDB.getConnection();
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
