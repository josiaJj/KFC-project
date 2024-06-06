package school.hei.kfc.kfcproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.kfc.kfcproject.model.Stock;
import school.hei.kfc.kfcproject.service.StockService;

import java.sql.SQLException;
import java.util.List;

@RestController("/stocks")
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;
    @GetMapping("/list")
    public List<Stock> list() throws SQLException {
        return stockService.getAllStocks();
    }
}
