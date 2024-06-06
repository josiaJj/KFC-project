package school.hei.kfc.kfcproject.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import school.hei.kfc.kfcproject.model.Stock;
import school.hei.kfc.kfcproject.repository.conf.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StockRepository implements CrudOperationsInterface<Stock> {
    private final ConnectionDB connectionDB;
    @Override
    public List<Stock> findAll() {
        List<Stock> stockList = new ArrayList<>();

        String sql = "select * from \"stock\"";

        try (
                Connection connection = connectionDB.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ) {
            while(resultSet.next()) {
                Stock stock = new Stock();
                stock.setId(resultSet.getInt("id"));
                stock.setAvailableQty(resultSet.getFloat("availableQty"));
                /*stock.setSupplyDateTime(resultSet.getTimestamp("supplyDateTime")
                        .toLocalDateTime()
                        .atZone(ZoneId.systemDefault())
                        .toInstant());*/
                stock.setSupplyDateTime(resultSet.getTimestamp("supplyDateTime"));
                stockList.add(stock);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return stockList;
    }
}
