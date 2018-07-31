package com.tcs.venta.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.tcs.venta.model.Producto;

@Component
public class ProductoBusinessImp extends BaseBusiness implements ProductoBusiness {


	@PostConstruct
	public void postContruct() 
	{
		
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
	
	@Override
	public List<Producto> listarProductos() 
	{
		return productos;
	}

	
	public Producto getProducto(long idProducto) 
	{
		for (Producto producto : productos) {
			if (producto.getId() == idProducto) {
				return producto;
			}
		}
		return null;
	}

	@Override
	public Producto crateProducto(Producto producto) 
	{
		productos.add(producto);
		return producto;
	}

	
	@Override
	public Producto updateProducto(Producto producto) 
	{
		int index = getIndex(producto.getId());
		if (index == -1) {
			return null;
		}
		productos.set(index, producto);
		return producto;

	}

	@Override
	public Producto deleteProducto(long idProducto) {
		int index = getIndex(idProducto);
		if (index == -1) {
			return null;
		}

		return productos.remove(index);

	}

	private int getIndex(long idProducto) {
		for (int i = 0; i < productos.size(); i++) {
			Producto producto = productos.get(i);
			if (producto.getId() == idProducto) {
				return i;
			}
		}
		return -1;
	}

	
}