package com.softwarecwb.cielo;

import java.util.Date;

import com.softwarecwb.cielo.request.CriarRequisicaoTransacao;
import com.softwarecwb.cielo.request.model.DadosEC;
import com.softwarecwb.cielo.request.model.DadosPedido;
import com.softwarecwb.cielo.request.model.DadosPortador;
import com.softwarecwb.cielo.request.model.FormaPagamento;
import com.softwarecwb.cielo.request.model.enumerador.Autorizar;
import com.softwarecwb.cielo.request.model.enumerador.Bandeira;
import com.softwarecwb.cielo.request.model.enumerador.CodigoProduto;
import com.softwarecwb.cielo.request.model.enumerador.Indicador;

public class CieloApplication {

	public static void main(String[] args) {
		CriarRequisicaoTransacao();
		
	}

	private static void CriarRequisicaoTransacao() {
		CriarRequisicaoTransacao requisicaoTransacao = new CriarRequisicaoTransacao();
		
		requisicaoTransacao.setDadosEc(new DadosEC("1006993069", "25fbb99741c739dd84d7b06ec78c9bac718838630f30b112d033ce2e621b34f3"));
		requisicaoTransacao.setDadosPortador(new DadosPortador("4012001038443335", "201620", Indicador.INFORMADO, "973",
				"Jakeline Vasconcelos", null));
		requisicaoTransacao.setDadosPedido(new DadosPedido("123",12.52 , null, new Date(), null, null,null,"BNE"));
		requisicaoTransacao.setFormaPagamento(new FormaPagamento(Bandeira.visa, CodigoProduto.CODIGO_A_VISTA,1));
		requisicaoTransacao.setAutorizar(Autorizar.AUTORIZAR_SEM_PASSAR_POR_AUTENTICACAO);
		requisicaoTransacao.setCapturar(false);
		
		System.out.println(requisicaoTransacao.enviarParaCielo(true));
		
	}

}