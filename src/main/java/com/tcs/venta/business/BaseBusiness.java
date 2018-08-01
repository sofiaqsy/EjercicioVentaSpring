package com.tcs.venta.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.tcs.venta.model.Cliente;
import com.tcs.venta.model.Compra;
import com.tcs.venta.model.Producto;


public class BaseBusiness {
	
	public static List<Cliente> clientes;
	public static List<Compra> compras;
	public static List<Producto> productos;
	
	@PostConstruct
	public void postContruct() {
		clientes = new ArrayList<>();
		
		  Cliente cliente = new Cliente();
	        cliente.setId(1L);
	        cliente.setNombres("Gustavo");

	        Cliente cliente2 = new Cliente();
	        cliente2.setId(2L);
	        cliente2.setNombres("Pepito");

	        clientes.add(cliente);
	        clientes.add(cliente2);
	        
	        compras = new ArrayList<>();

			Compra compra = new Compra();
			compra.setId(1L);
			compra.setCantidad(3);
			compra.setId_cliente(1L);
			compra.setId_producto(1L);
			compra.setMonto_total(300.2);


			Compra compra2 = new Compra();
			compra2.setId(2L);
			compra2.setCantidad(5);
			compra2.setId_cliente(2L);
			compra2.setId_producto(2L);
			compra2.setMonto_total(200.2);

			compras.add(compra);
			compras.add(compra2);
			
			productos = new ArrayList<>();

			Producto producto = new Producto();
			producto.setId(1L);
			producto.setNombre("Detergente bol");
			producto.setPrecio(3.5);
			producto.setStock(230);
			
			Producto producto2 = new Producto();
			producto2.setId(2L);
			producto2.setNombre("Avena 3 ositos");
			producto2.setPrecio(2.5);
			producto2.setStock(500);
			

			productos.add(producto);
			productos.add(producto2);
			
	}


}
