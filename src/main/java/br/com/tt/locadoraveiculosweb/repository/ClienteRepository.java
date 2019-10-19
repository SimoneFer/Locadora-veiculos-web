package br.com.tt.locadoraveiculosweb.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tt.locadoraveiculosweb.model.Caminhao;
import br.com.tt.locadoraveiculosweb.model.Carro;
import br.com.tt.locadoraveiculosweb.model.Cliente;
import br.com.tt.locadoraveiculosweb.model.Moto;
import br.com.tt.locadoraveiculosweb.model.PessoaFisica;
import br.com.tt.locadoraveiculosweb.model.Veiculo;

@Repository
public class ClienteRepository {

	private List<Cliente> clientes;
	
	public ClienteRepository() {
		clientes = new LinkedList<>();
		clientes.add(new PessoaFisica("Fulano"));
		
		
	}

	public List<Cliente> listarTodos() {
		return clientes;
	}

	public void incluir(Cliente cliente) {
		clientes.add(cliente);
	}
}
}
