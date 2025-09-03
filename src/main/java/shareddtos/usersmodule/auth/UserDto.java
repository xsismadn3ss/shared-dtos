package shareddtos.usersmodule.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase DTO que hereda de la clase SimpleUserDto
 *<p>
 *     Este DTO contiene el atributo password que corresponde con la
 *     contraseña del usuario.
 *</p>
 * <p>
 *     Además, contiene una función para convertir el DTO a una versión
 *     simplificada en la que no se incluye la contraseña.
 * </p>
 *
 * @author xsismadn3s
 * @version 1.0
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends SimpleUserDto {
    private String password;

    /**
     * <b>To Simple User DTO</b>
     * <p>Convertir DTO a su versión simplificada en
     * la que no se incluye la contraseña del usuario</p>
     * @return Datos de usuario sin contraseña
     */
    public SimpleUserDto toSimpleUserDto(){
        return new SimpleUserDto(
                this.getId(),
                this.getUsername(),
                this.getFirstName(),
                this.getLastName(),
                this.getEmail()
        );
    }
}