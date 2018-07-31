package com.tcs.venta.business;

import java.util.List;

import com.tcs.venta.model.Producto;

public interface ProductoBusiness{
	
    List<Producto> listarProductos();
     
    Producto getProducto(long idProducto);

	Producto crateProducto(Producto producto);

	Producto updateProducto(Producto producto);

	Producto deleteProducto(long idProducto);
}