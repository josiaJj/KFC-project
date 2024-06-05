package school.hei.kfc.kfcproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.kfc.kfcproject.model.DishIsAvailable;
import school.hei.kfc.kfcproject.service.DishIsAvailableService;

import java.util.List;

@RestController
@RequestMapping("dishIsAvailable")
public class DishIsAvailableController {
    private final DishIsAvailableService dishIsAvailableService;
    public DishIsAvailableController(DishIsAvailableService dishIsAvailableService) {
        this.dishIsAvailableService = dishIsAvailableService;
    }
    @GetMapping("list")
    public List<DishIsAvailable> getAllDishIsAvailable() {
        return dishIsAvailableService.getAllDishIsAvailable();
    }
}
