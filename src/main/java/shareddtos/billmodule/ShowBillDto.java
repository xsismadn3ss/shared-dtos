package shareddtos.billmodule;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ShowBillDto {
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
    private List<ProductBillDTO> products;

    // Totals
    private double nonTaxedSales;
    private double exemptSales;
    private double taxedSales;
    private double iva; 
    private double perceivedIva;
    private double withheldIva;
    private double totalWithIva;
}
