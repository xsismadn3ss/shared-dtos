package com.componente.promociones.model.dto.integraciones.lealtad;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para solicitar la aplicación de promociones según los puntos de lealtad del cliente.
 *
 * <p>
 * Este DTO es utilizado por el componente de promociones para recibir información
 * de los puntos de lealtad disponibles de un cliente y el tipo de promoción que se
 * puede aplicar.
 * </p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PuntosLealtadRequest {

    /**
     * <b>Identificador único del cliente</b>
     */
    @NotNull(message = "El clienteId no puede ser nulo")
    private Long clienteId;

    /**
     * <b>Cantidad de puntos de lealtad disponibles</b>
     */
    @NotNull(message = "Los puntosDisponibles no pueden ser nulos")
    private int puntosDisponibles;

    /**
     * <b>Tipo de promoción que se puede aplicar (ej. DESCUENTO_PORCENTAJE)</b>
     */
    @NotNull(message = "El tipoPromocionAplicable no puede ser nulo")
    private String tipoPromocionAplicable;
}
