package shareddtos.billmodule.exception;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ErrorResponse {

    private LocalDateTime timestemp;
    private int status;
    private String error;
    private String message;
    private String path;
    private List<String> details;

}
