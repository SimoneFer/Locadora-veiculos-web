package br.com.tt.locadoraveiculosweb.model;

import br.com.tt.locadoraveiculosweb.model.enums.TipoCombustivel;

public abstract class Veiculo {

	public Veiculo(String placa) {
		this.placa = placa;
	}
	protected String placa;
	protected String marca;
	protected String modelo;
	protected float quilometragem;
	protected TipoCombustivel tipoCombustivel;
	
	public String getPlaca() {
		return placa;
	}
	
	
	
}
