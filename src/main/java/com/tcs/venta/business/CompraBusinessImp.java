package com.tcs.venta.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Component;

import com.tcs.venta.model.Cliente;
import com.tcs.venta.model.Compra;

@Component
public class CompraBusinessImp extends BaseBusiness implements CompraBusiness {



	@Override
	public List<Compra> listarCompras()
	{
		return compras;
	}


	public Compra getCompra(long idCompra)
	{
		for (Compra compra : compras) {
			if (compra.getId() == idCompra) {
				return compra;
			}
		}
		return null;
	}

	@Override
	public Compra crateCompra(Compra compra)
	{
		compras.add(compra);
		return compra;
	}


	@Override
	public Compra updateCompra(Compra compra)
	{
		int index = getIndex(compra.getId());
		if (index == -1) {
			return null;
		}
		compras.set(index, compra);
		return compra;

	}

	@Override
	public Compra deleteCompra(long idCompra) {
		int index = getIndex(idCompra);
		if (index == -1) {
			return null;
		}

		return compras.remove(index);

	}



	@Override
	public Map<String, String>  getCompraByCliente(long idCliente) {
		
		
		Map<String, String> comprasCliente = new HashMap<String, String>();

		
		for (Compra laCompra : compras) {
			if(laCompra.getId_cliente()==idCliente) {
				comprasCliente.put("cantidad", Integer.toString(laCompra.getCantidad()));
				comprasCliente.put("id", Long.toString(laCompra.getId()));
				comprasCliente.put("Monto total", Double.toString(laCompra.getMonto_total()));
			
			}
			
		}
		

		
		
return comprasCliente;
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