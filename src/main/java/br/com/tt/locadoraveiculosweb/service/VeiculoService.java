package br.com.tt.locadoraveiculosweb.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tt.locadoraveiculosweb.model.Veiculo;
import br.com.tt.locadoraveiculosweb.model.enums.TipoCombustivel;
import br.com.tt.locadoraveiculosweb.repository.VeiculoRepository;

@Service
public class VeiculoService {

	private final VeiculoRepository veiculoRepository;

	public VeiculoService(VeiculoRepository veiculoRepository) {
		this.veiculoRepository = veiculoRepository;
	}

	public List<Veiculo> listarTodos() {
		return veiculoRepository.listarTodos();
	}

	public List<TipoCombustivel> listarTiposCombustivel() {
		return Arrays.asList(TipoCombustivel.values());
	}

	public void incluir(Veiculo veiculo) {
		// validações de entrada de dados
		veiculoRepository.incluir(veiculo);
	}
}
