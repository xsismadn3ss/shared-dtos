package com.componente.promociones.model.dto.integraciones.lealtad;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO de respuesta para enviar las promociones disponibles a un cliente
 * según sus puntos de lealtad.
 *
 * <p>
 * Contiene el ID del cliente y una lista de nombres o códigos de promociones
 * que puede utilizar.
 * </p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromocionesDisponiblesResponse {

    /**
     * <b>Identificador único del cliente</b>
     */
    @NotNull(message = "El clienteId no puede ser nulo")
    private Long clienteId;

    /**
     * <b>Lista de nombres o códigos de las promociones que el cliente puede usar</b>
     */
    @NotNull(message = "La lista de promociones no puede ser nula")
    private List<String> promociones;
}
