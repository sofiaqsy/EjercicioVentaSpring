package com.tcs.venta.business;

import java.util.List;

import com.tcs.venta.model.Cliente;

public interface ClienteBusiness{
	
    List<Cliente> listarClientes();
     
    Cliente getCliente(long idCliente);

	Cliente crateCliente(Cliente cliente);

	Cliente updateCliente(Cliente cliente);

	Cliente deleteCliente(long idCliente);
}