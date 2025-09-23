package com.componente.promociones.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * DTO para gestionar la información de cupones de promoción
 *
 * <p>
 * Este DTO es utilizado para transferir datos entre las capas de la aplicación,
 * representando los detalles de un cupón de descuento, incluyendo
 * su código, tipo, valor, estado y fechas de validez.
 * </p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuponesDTO {

    /**
     * <b>Identificador único del cupón</b>
     */
    private Long id;

    @NotBlank(message = "El codigo es obligatorio")
    @Size(min = 4, max = 10, message = "El codigo debe tener entre 4 y 10 caracteres")
    /**
     * <b>Código alfanumérico del cupón de descuento</b>
     */
    private String codigo;

    @NotBlank(message = "El tipo de promoción no puede estar vacío")
    /**
     * <b>Tipo de promoción del cupón (ej. porcentaje, valor fijo)</b>
     */
    private String tipo;

    @NotNull(message = "El valor del descuento no puede ser nulo")
    /**
     * <b>Valor del descuento a aplicar</b>
     */
    private Double descuento;

    @NotNull(message = "El número de usos no puede ser nulo")
    /**
     * <b>Número de veces que el cupón puede ser utilizado</b>
     */
    private Integer usos;

    @NotBlank(message = "El estado no puede estar vacío")
    /**
     * <b>Estado actual del cupón (ej. activo, expirado, deshabilitado)</b>
     */
    private String estado;

    @NotNull(message = "La fecha de inicio no puede ser nula")
    /**
     * <b>Fecha y hora de inicio de la validez del cupón</b>
     */
    private LocalDateTime fecha_inicio;

    @NotNull(message = "La fecha de fin no puede ser nula")
    /**
     * <b>Fecha y hora de finalización de la validez del cupón</b>
     */
    private LocalDateTime fecha_fin;

    /**
     * Relacion con la tabla de promocion
     */
    private Long promocionId

}