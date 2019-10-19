package br.com.tt.locadoraveiculosweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {

	

	@GetMapping("/cliente-listar")
	public String redirecionarTelaCliente() {
		return "/cliente-listar";
	}

	@GetMapping("/locacao-listar")
	public String redirecionarTelaLocacao() {
		return "/locacao-listar";
	}
}
