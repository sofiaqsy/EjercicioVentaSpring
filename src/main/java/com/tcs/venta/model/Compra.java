package com.tcs.venta.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Compra {
 	private Long id;
 	private Double monto_total;
 	private Integer cantidad;
 	private Date fecha;
 	private Long id_cliente;
 	private Long id_producto;

}
