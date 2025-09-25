package shareddtos.billmodule.bill;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shareddtos.billmodule.BillItem.BillItemDTO;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class FinalConsumerBillDTO {
    private Long id;
    private String generationCode; 
    private String controlNumber; 
    private LocalDateTime billGenerationDate;
    private String account;
    private String paymentCondition;

    //transmitter
    private String companyName;
    private String companyDocument; 
    private String companyAddress;
    private String companyEmail;
    private String companyPhone;    

    //receiver
    private String customerName;
    private String customerDocument; 
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;  

    //products
    private List<BillItemDTO> products;

    // Totals
    private Double nonTaxedSales;
    private Double exemptSales;
    private Double taxedSales;
    private Double iva; // 13% de IVA
    private Double perceivedIva;
    private Double withheldIva;
    private Double totalWithIva;

}
