package shareddtos.usersmodule.auth;

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
    private String value;
}
