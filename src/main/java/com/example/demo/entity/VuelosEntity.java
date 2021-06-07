package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "API_VUELOS")
public class VuelosEntity implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 616857998416344583L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "FECHA_SALIDA")
	private LocalDate fechaSalida;

	@Column(name = "FECHA_LLEGADA")
	private LocalDate fechaLlegada;

	@Column(name = "CIUDAD_ORIGEN")
	private String ciudadOrigen;

	@Column(name = "CIUDAD_DESTINO")
	private String ciudadDestino;

	// Otra Entidad
	@Column(name = "NOMBRE_PASAJERO")
	private String nombrePasajero;

	// Otra Entidad
	@Column(name = "EDAD_PASAJERO")
	private Integer edadPasajero;

	// Otra Entidad
	@Column(name = "TIENE_BODEGA_EQUIPAJE")
	private Boolean tieneBodegaEquipaje;

	@Column(name = "PRECIO")
	private BigDecimal precio;

	@Column(name = "HORA_SALIDA")
	private LocalTime horaSalida;

	@Column(name = "HORA_LLEGADA")
	private LocalTime horaLlegada;
}
