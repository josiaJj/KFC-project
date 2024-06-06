package school.hei.kfc.kfcproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ingredient {
    int id;
    String name;
    float neededQty;
    String unity;
    float unitPrice;
}
