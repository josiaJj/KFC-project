package school.hei.kfc.kfcproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DishHasIngredient {
    private int id;
    private int dishId;
    private int ingredientId;
}
