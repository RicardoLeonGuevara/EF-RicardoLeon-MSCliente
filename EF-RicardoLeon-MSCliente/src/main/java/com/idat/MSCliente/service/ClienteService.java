package com.idat.MSCliente.service;

import java.util.List;

import com.idat.MSCliente.dto.ClienteDTO;

public interface ClienteService {
	List<ClienteDTO> listar();
	void guardar(ClienteDTO cliente);
}
