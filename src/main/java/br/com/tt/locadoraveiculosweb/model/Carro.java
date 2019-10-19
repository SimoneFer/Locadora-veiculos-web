package br.com.tt.locadoraveiculosweb.model;

import br.com.tt.locadoraveiculosweb.model.enums.Cambio;
import br.com.tt.locadoraveiculosweb.model.enums.NumeroPortas;
import br.com.tt.locadoraveiculosweb.model.enums.TipoCarro;

public class Carro extends Veiculo {

	public Carro(String placa) {
		super(placa);
		
	}
	private TipoCarro tipo;
	private Cambio cambio;
	private NumeroPortas numeroPortas;
	
}
