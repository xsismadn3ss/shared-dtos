package shareddtos.clientsmodule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h2>ClienteCreateDto</h2>
 * <p>
 *     DTO para crear usuarios
 * </p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteCreateDto {

    /**
     * nombre del cliente
     */
    private String nombre;

    /**
     * apellido del cliente
     */
    private String apellido;

    /**
     * email del cliente
     */
    private String correo;

    /**
     * telefono del cliente
     */
    private String telefono;
}
