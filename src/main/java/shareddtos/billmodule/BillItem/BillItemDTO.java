package shareddtos.billmodule.BillItem;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillItemDTO {
    private Long id;
    private Long productId;
    private String name;
    private int requestedQuantity;
    private Double price;
    private Double subTotal;
}
