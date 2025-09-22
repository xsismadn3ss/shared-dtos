package shareddtos.billmodule.mapper;

import java.util.stream.Collectors;

import shareddtos.billmodule.FinalConsumerBillDTO;
import shareddtos.billmodule.ProductBillDTO;
import shareddtos.billmodule.ShowBillDto;

public class FinalConsumerBillMapper {
    public static FinalConsumerBillDTO ShowtoEntity(ShowBillDto showBillDto){
        return new FinalConsumerBillDTO(
            null,
            showBillDto.getGenerationCode(),
            showBillDto.getControlNumber(),
            showBillDto.getBillGenerationDate(),
            showBillDto.getAccount(),
            showBillDto.getPaymentCondition(),
            showBillDto.getCompanyName(),
            showBillDto.getCompanyDocument(),
            showBillDto.getCompanyAddress(),
            showBillDto.getCompanyEmail(),
            showBillDto.getCompanyPhone(),
            showBillDto.getCustomerName(),
            showBillDto.getCustomerDocument(),
            showBillDto.getCustomerAddress(),
            showBillDto.getCustomerEmail(),
            showBillDto.getCustomerPhone(),
            showBillDto.getProducts(),
            showBillDto.getNonTaxedSales(),
            showBillDto.getExemptSales(),
            showBillDto.getTaxedSales(),
            showBillDto.getIva(),
            showBillDto.getPerceivedIva(),
            showBillDto.getWithheldIva(),
            showBillDto.getTotalWithIva()
        );

    }
    
    public static ShowBillDto toShowDto(FinalConsumerBillDTO billDTO ){
        return new ShowBillDto(
            billDTO.getGenerationCode(),
            billDTO.getControlNumber(),
            billDTO.getBillGenerationDate(),
            billDTO.getAccount(),
            billDTO.getPaymentCondition(),
            billDTO.getCompanyName(),
            billDTO.getCompanyDocument(),
            billDTO.getCompanyAddress(),
            billDTO.getCompanyEmail(),
            billDTO.getCompanyPhone(),
            billDTO.getCustomerName(),
            billDTO.getCustomerDocument(),
            billDTO.getCustomerAddress(),
            billDTO.getCustomerEmail(),
            billDTO.getCustomerPhone(),
            billDTO.getProducts().stream()
                .map(product -> {
                    ProductBillDTO productDto = new ProductBillDTO();
                    productDto.setId(product.getId());
                    productDto.setName(product.getName());
                    productDto.setQuantity(product.getQuantity());
                    productDto.setPrice(product.getPrice());
                    return productDto;
                }).collect(Collectors.toList()),
            billDTO.getNonTaxedSales(),
            billDTO.getExemptSales(),
            billDTO.getTaxedSales(),
            billDTO.getIva(),
            billDTO.getPerceivedIva(),
            billDTO.getWithheldIva(),
            billDTO.getTotalWithIva()
        );
    }

}
