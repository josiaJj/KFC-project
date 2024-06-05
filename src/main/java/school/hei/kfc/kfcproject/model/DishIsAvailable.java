package school.hei.kfc.kfcproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DishIsAvailable {
    int id;
    boolean isAvailable;
    int restaurantId;
    int dishId;
}
