package com.tcs.venta.business;

import java.util.List;


import org.springframework.stereotype.Component;

import com.tcs.venta.model.Producto;

@Component
public class ProductoBusinessImp extends BaseBusiness implements ProductoBusiness {



	
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