package br.com.tt.locadoraveiculosweb.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tt.locadoraveiculosweb.model.Cliente;
import br.com.tt.locadoraveiculosweb.repository.ClienteRepository;



@Service
public class ClienteService {
	
	private final ClienteRepository veiculoRepository;
	private ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> listarTodos() {
		return clienteRepository.listarTodos();
	}

	
	

	public void incluir(Cliente cliente) {
		// validações de entrada de dados
		clienteRepository.incluir(cliente);
	}
}


