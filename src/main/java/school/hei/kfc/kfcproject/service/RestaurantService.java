package school.hei.kfc.kfcproject.service;

import org.springframework.stereotype.Service;
import school.hei.kfc.kfcproject.model.Restaurant;
import school.hei.kfc.kfcproject.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {
    public final RestaurantRepository restaurantRepository;
    RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
