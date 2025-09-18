package shareddtos.usersmodule.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para encriptar cadenas de texto
 *
 * <p>
 *     Este DTO es utilizado para almacenar una cadena texto
 *     que será cifrada
 * </p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncryptDto {
    /**
     * <b>Texto a cifrar</b>
     */
    @NotNull(message = "El campo value no puede ser nulo")
    @NotBlank(message = "El campo value no puede estar vacío")
    private String value;
}
