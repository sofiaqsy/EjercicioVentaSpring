package com.tcs.venta.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.tcs.venta.model.Cliente;
import com.tcs.venta.model.Compra;

@Component
public class CompraBusinessImp extends BaseBusiness implements CompraBusiness {


	@PostConstruct
	public void postContruct()
	{

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

	}

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
	public Compra getCompraByCliente(long idCliente) {
		
		
		Map<String, String> comprasCliente = new HashMap<String, String>();

		
		for (Compra laCompra : compras) {
			if(laCompra.getId_cliente()==idCliente) {
				comprasCliente.put("cantidad", Integer.toString(laCompra.getCantidad()));
				comprasCliente.put("id", Long.toString(laCompra.getId()));
				comprasCliente.put("Monto total", Double.toString(laCompra.getMonto_total()));
			
			}
			
		}
		

		
		
return null;
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