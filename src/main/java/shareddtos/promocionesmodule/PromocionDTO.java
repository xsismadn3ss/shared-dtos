package com.componente.promociones.model.dto;

import com.componente.promociones.enums.TipoCondicion;
import com.componente.promociones.enums.TipoPromocion;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO para gestionar la información de promociones
 *
 * <p>
 * Este DTO es utilizado para transferir datos que representan los detalles
 * completos de una promoción, incluyendo sus características, valor y validez.
 * </p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromocionDTO {

    /**
     * <b>Identificador único de la promoción</b>
     */
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min =3, max=100, message= "El nombre debe tener entre 3 y 100 caracteres")
    /**
     * <b>Nombre de la promoción</b>
     */
    private String nombre;

    @Size(max = 500, message = "La descripción no puede exceder 500 caracteres")
    /**
     * <b>Descripción detallada de la promoción</b>
     */
    private String descripcion;

    @NotNull(message = "El tipo de promoción es obligatorio")
    /**
     * <b>Tipo de promoción (ej. porcentaje, envío gratis)</b>
     */
    private TipoPromocion tipoPromocion;

    @NotNull(message = "El tipo de condición es obligatorio")
    /**
     * <b>Tipo de condición requerida para aplicar la promoción</b>
     */
    private TipoCondicion tipoCondicion;

    @NotNull(message = "El valor del descuento es obligatorio")
    @DecimalMin(value = "0.0", inclusive = false, message = "El valor del descuento debe ser mayor que 0")
    /**
     * <b>Valor del descuento o beneficio de la promoción</b>
     */
    private float valorDescuento;

    @NotNull(message = "La fecha de inicio es obligatoria")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    /**
     * <b>Fecha y hora de inicio de la validez de la promoción</b>
     */
    private LocalDateTime fechaInicio;

    @NotNull(message = "La fecha de fin es obligatoria")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    /**
     * <b>Fecha y hora de finalización de la validez de la promoción</b>
     */
    private LocalDateTime fechaFin;

    /**
     * <b>Indica si la promoción se puede acumular con otras</b>
     */
    private boolean esAcumulable;

    /**
     * <b>Indica si la promoción está activa actualmente</b>
     */
    private boolean estaActiva;
}