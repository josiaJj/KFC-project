package school.hei.kfc.kfcproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.kfc.kfcproject.model.Restaurant;
import school.hei.kfc.kfcproject.service.RestaurantService;

import java.sql.SQLException;
import java.util.List;

@RestController
//@RequestMapping("/restaurants")
public class RestaurantController {
    public final RestaurantService restaurantService;
    RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/list")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }
}
