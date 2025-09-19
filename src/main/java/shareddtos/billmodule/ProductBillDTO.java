package shareddtos.billmodule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBillDTO {
    private Long id;
    private String name;
    private Integer quantity;
    private Double price;
}
