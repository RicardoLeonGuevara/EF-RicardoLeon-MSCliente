package com.idat.MSCliente.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.idat.MSCliente.dto.ClienteDTO;
import com.idat.MSCliente.model.Cliente;
import com.idat.MSCliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<ClienteDTO> listar() {
		List<ClienteDTO> listado = new ArrayList<>();
		ClienteDTO dto = null;
				
		for (Cliente cliente : repository.findAll()) {
			dto = new ClienteDTO();
			
			dto.setCodigo(cliente.getIdCliente());
			dto.setNombre(cliente.getNombreCliente());
			dto.setApellido(cliente.getApellidoCliente());
			dto.setCelular(cliente.getNroCelular());
			dto.setDireccion(cliente.getDireccion());
			listado.add(dto);
		}

		return listado;
	}
	
	@Override
	public void guardar(ClienteDTO cliente) {
		Cliente cli = new Cliente();
		cli.setIdCliente(cliente.getCodigo());
		cli.setNombreCliente(cliente.getNombre());
		cli.setApellidoCliente(cliente.getApellido());
		cli.setNroCelular(cliente.getCelular());
		cli.setDireccion(cliente.getDireccion());
		
		repository.save(cli);
	}
}
