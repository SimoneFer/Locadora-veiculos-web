package br.com.tt.locadoraveiculosweb.model;

public class PessoaJuridica {
	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return String.format("Cliente#PessoaJuridica[nome=%s,cnpj=%s]", cnpj);
	}
}

