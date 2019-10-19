package br.com.tt.locadoraveiculosweb.model;

import br.com.tt.locadoraveiculosweb.model.enums.Cambio;
import br.com.tt.locadoraveiculosweb.model.enums.TipoCaminhao;

public class Caminhao extends Veiculo {
	
	

	public Caminhao(String placa) {
		super(placa);
	}
	private TipoCaminhao tipo;
	private Cambio cambio;
	
}
