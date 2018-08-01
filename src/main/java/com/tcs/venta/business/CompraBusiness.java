package com.tcs.venta.business;

import java.util.List;
import java.util.Map;

import com.tcs.venta.model.Compra;

public interface CompraBusiness{
	
    List<Compra> listarCompras();
     
    Compra getCompra(long idCompra);
    
    Map<String, String> getCompraByCliente(long idCliente);

	Compra crateCompra(Compra compra);

	Compra updateCompra(Compra compra);

	Compra deleteCompra(long idCompra);
	
	
}