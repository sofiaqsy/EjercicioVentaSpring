package com.tcs.venta.business;


import java.util.List;

import org.springframework.stereotype.Component;

import com.tcs.venta.model.Cliente;

@Component
public class ClienteBusinessImp extends BaseBusiness implements ClienteBusiness{
	
	
	
    public List <Cliente> listarClientes(){
    	
        return clientes;
    }
    
    public Cliente getCliente(long idCliente) {
    	for(Cliente cliente : clientes) {
    		if(cliente.getId() == idCliente) {
    			return cliente;
    		}
    	}
    	return null;
    }

	@Override
	public Cliente crateCliente(Cliente cliente) {
		clientes.add(cliente);
		return cliente;
	}
	
	@Override
	public Cliente updateCliente(Cliente cliente) {
		int index = getIndex(cliente.getId());
		if(index == -1) {
			return null;
		}
		clientes.set(index, cliente);
		return cliente;
		
	}
	
	@Override
	public Cliente deleteCliente( long idCliente) {
		int index = getIndex(idCliente);
		if(index == -1) {
			return null;
		}
		
		return clientes.remove(index);
		
	}
	
	private int getIndex(long idCliente) {
		for (int i = 0; i < clientes.size(); i++) {
		Cliente cliente = clientes.get(i);
		if (cliente.getId() == idCliente) {
		return i;
		}
		}
		return -1;
		}
}