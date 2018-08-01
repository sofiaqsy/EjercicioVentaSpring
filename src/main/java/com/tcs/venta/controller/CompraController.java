package com.tcs.venta.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.venta.business.CompraBusiness;
import com.tcs.venta.model.Compra;

@RestController
public class CompraController {
	@Autowired
    private CompraBusiness compraBusiness;

	@GetMapping("/compra")

    public List<Compra> listarClientes(){
        return compraBusiness.listarCompras();
    }

	@GetMapping("compra/{idCompra}")
	public Compra getCliente(@PathVariable("idCompra") long idCompra) {

		return compraBusiness.getCompra(idCompra);

	}
	
	@GetMapping("compra/cliente/{idCliente}")
	public Map<String, String> getCompraByCliente(@PathVariable("idCliente") long idCliente) {

		return compraBusiness.getCompraByCliente(idCliente);

	}

	@PostMapping("/compra")
	public Compra createCliente(@RequestBody Compra compra) {
		return compraBusiness.crateCompra(compra);

	}

	@PutMapping("/compra")
	public Compra updatcompra(@RequestBody Compra compra) {
		return  compraBusiness.updateCompra(compra);

	}

	@DeleteMapping("/compra/{idCompra}")
	public Compra deletecompra(@PathVariable("idCompra") long idCompra) {
		return compraBusiness.deleteCompra(idCompra);
	}


}