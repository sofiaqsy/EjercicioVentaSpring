package com.tcs.venta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.venta.business.ProductoBusiness;
import com.tcs.venta.model.Producto;

@RestController
public class ProductoController {
	@Autowired
    private ProductoBusiness productoBusiness;

	@GetMapping("/producto")
   
    public List<Producto> listarClientes(){
        return productoBusiness.listarProductos();
    }
	
	@GetMapping("producto/{idProducto}")
	public Producto getCliente(@PathVariable("idProducto") long idProducto) {
		
		return productoBusiness.getProducto(idProducto);
		
	}
	
	@PostMapping("/producto")
	public Producto createCliente(@RequestBody Producto producto) {
		return productoBusiness.crateProducto(producto);
		
	}
	
	@PutMapping("/producto")
	public Producto updatProducto(@RequestBody Producto producto) {
		return  productoBusiness.updateProducto(producto);
		
	}
	
	@DeleteMapping("/producto/{idProducto}")
	public Producto deleteProducto(@PathVariable("idProducto") long idProducto) {
		return productoBusiness.deleteProducto(idProducto);
	}

	
}