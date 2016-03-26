package com.softwarecwb.cielo.request.model.enumerador;

public enum Indicador {

	NAO_INFORMADO(0), INFORMADO(1), ILEGIVEL(2), INEXISTENTE(9);

	private final int valor;

	private Indicador(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
}