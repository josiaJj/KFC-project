package school.hei.kfc.kfcproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.kfc.kfcproject.model.Stock;
import school.hei.kfc.kfcproject.repository.StockRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockService {
    private final StockRepository stockRepository;
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
}
