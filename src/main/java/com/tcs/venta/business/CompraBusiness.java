package com.tcs.venta.business;

import java.util.List;

import com.tcs.venta.model.Compra;

public interface CompraBusiness{
	
    List<Compra> listarCompras();
     
    Compra getCompra(long idCompra);
    
    Compra getCompraByCliente(long idCliente);

	Compra crateCompra(Compra compra);

	Compra updateCompra(Compra compra);

	Compra deleteCompra(long idCompra);
	
	
}