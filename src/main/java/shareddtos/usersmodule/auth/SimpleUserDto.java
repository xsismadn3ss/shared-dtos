package shareddtos.usersmodule.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase DTO que representa la información básica de un usuario
 *
 * <p>
 *     Esta clase contiene los datos de un usuario y se utiliza principalmente para
 *     operaciones de autenticación.
 * </p>
 * <p>
 *     La clase utiliza anotaciones de Lombok para generar automáticamente los métodos
 *     getter, setter, equals, hashCode y toString, así como constructores
 * </p>
 * @author xsismadn3ss
 * @version 1.0
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleUserDto {
    /**
     * <h5>ID</h5>
     * <p>
     *     Este campo representa la clave primaria dle usuario en la base de datos.
     * </p>
     * */
    private Long id;
    /**
     * <h5>Nombre de usuario</h5>
     * <p>
     *     Este campo corresponde al nombre de usuario el cual es único en el
     *     sistema.
     * </p>
     */
    private String username;
    /**
     * <h5>First Name</h5>
     * <p>Nombres del usuario</p>
     */
    private String firstName;
    /**
     * <h5>Last Name</h5>
     * <p>Apellidos del usuario</p>
     */
    private String lastName;

    /**
     * <h5>Email</h5>
     * <p>Correo electrónico del usuario, este es único en el sistema</p>
     */
    private String email;
}