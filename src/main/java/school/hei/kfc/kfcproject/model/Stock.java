package school.hei.kfc.kfcproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Stock {
    private int id;
    private float availableQty;
    private Timestamp supplyDateTime;
    private int ingredientId;
}
