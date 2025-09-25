package shareddtos.billmodule.BillItem;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBillItemDTO {
    private Long productId;
    private String name;
    private int requestedQuantity;
    private BigDecimal price;
    private BigDecimal subTotal;

}
