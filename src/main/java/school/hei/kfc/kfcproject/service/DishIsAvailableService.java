package school.hei.kfc.kfcproject.service;

import org.springframework.stereotype.Service;
import school.hei.kfc.kfcproject.model.DishIsAvailable;
import school.hei.kfc.kfcproject.repository.DishIsAvailableRepository;

import java.util.List;

@Service
public class DishIsAvailableService {
    private final DishIsAvailableRepository dishIsAvailableRepository;
    public DishIsAvailableService(DishIsAvailableRepository dishIsAvailableRepository) {
        this.dishIsAvailableRepository = dishIsAvailableRepository;
    }
    public List<DishIsAvailable> getAllDishIsAvailable() {
        return dishIsAvailableRepository.findAll();
    }
}
