package shareddtos.billmodule.bill;

import java.math.BigDecimal;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shareddtos.billmodule.BillItem.BillItemDTO;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillCreateDto {
    @NotBlank(message = "La condicion de pago no puede ir vacia")
    private String paymentCondition;
    //transmitter
    @NotBlank(message = "El nombre de la compañia no debe de estar en blanco")
    private String companyName;
    @NotBlank(message = "El documento de la compañia no debe de estar en blanco")
    private String companyDocument; // NIT
    @NotBlank(message = "El direccion de la compañia no debe de estar en blanco")
    private String companyAddress;
    @NotBlank(message = "El email de la compañia no debe de estar en blanco")
    private String companyEmail;
    @NotBlank(message = "El telefono de la compañia no debe de estar en blanco")
    private String companyPhone;    

    //receiver
    private String customerName;
    private String customerDocument;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;  

    //products
    @NotEmpty(message = "Debe llevar almenos llevar un producto")
    private List<BillItemDTO> products;

    // Totals
    @PositiveOrZero(message = "Las ventas no gravadas deben ser mayor o igual a 0")
    private BigDecimal nonTaxedSales;
    @PositiveOrZero(message = "Las ventas exentas deben ser mayor o igual a 0")
    private BigDecimal exemptSales;
    @PositiveOrZero(message = "Las ventas gravadas deben ser mayor o igual a 0")
    private BigDecimal taxedSales;
    @PositiveOrZero(message = "El iva debe de ser mayor 0")
    private BigDecimal perceivedIva;
    private BigDecimal withheldIva;

}
