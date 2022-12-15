package com.idat.MSCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MSCliente.service.ClienteService;
import com.idat.MSCliente.dto.ClienteDTO;

@Controller
@RequestMapping("/api/cliente/v1")
public class ClienteController {
	@Autowired
	private ClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<ClienteDTO> listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody ClienteDTO dto) {
		service.guardar(dto);
	}
}
