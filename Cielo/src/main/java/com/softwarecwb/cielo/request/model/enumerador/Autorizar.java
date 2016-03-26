package com.softwarecwb.cielo.request.model.enumerador;

public enum Autorizar {

	NAO_AUTORIZAR(0), AUTORIZAR_SOMENTE_SE_AUTENTICADA(1), AUTORIZAR_AUTENTICADA_E_NAO_AUTENTICADA(
			2), AUTORIZAR_SEM_PASSAR_POR_AUTENTICACAO(3), TRANSACAO_RECORRENTE(4);

	private final int valor;

	private Autorizar(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}