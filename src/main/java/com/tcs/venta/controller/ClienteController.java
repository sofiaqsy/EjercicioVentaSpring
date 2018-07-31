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

import com.tcs.venta.business.ClienteBusiness;
import com.tcs.venta.model.Cliente;

@RestController
public class ClienteController {
    //@RequestMapping(value="/cliente", method=RequestMethod.GET)
	@Autowired
    private ClienteBusiness clienteBusiness;

	@GetMapping("/cliente")
    //@ResponseBody
    public List<Cliente> listarClientes(){
        return clienteBusiness.listarClientes();
//      ClienteBusiness clienteBusiness = new ClienteBusiness();
//      List<Cliente> clientes=clienteBusiness.listarClientes();
//      return clientes;
    }
	
	@GetMapping("cliente/{idCliente}")
	public Cliente getCliente(@PathVariable("idCliente") long idCliente) {
		/*Cliente cliente = new Cliente();
		cliente.setId(idCliente);
		cliente.setNombres("gustavo");*/
		return clienteBusiness.getCliente(idCliente);
		
	}
	
	@PostMapping("/cliente")
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteBusiness.crateCliente(cliente);
		
	}
	
	@PutMapping("/cliente")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		return  clienteBusiness.updateCliente(cliente);
		
	}
	
	@DeleteMapping("/cliente/{idCliente}")
	public Cliente deleteCliente(@PathVariable("idCliente") long idCliente) {
		return clienteBusiness.deleteCliente(idCliente);
	}

	
}