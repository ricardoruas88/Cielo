package com.softwarecwb.cielo.request;

import java.util.UUID;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.model.DadosPedido;
import com.softwarecwb.cielo.request.model.DadosPortador;
import com.softwarecwb.cielo.request.model.FormaPagamento;
import com.softwarecwb.cielo.request.model.enumerador.Autorizar;

@XmlRootElement(name = "requisicao-transacao")
@XmlType(propOrder = { "dadosPortador", "dadosPedido", "formaPagamento", "urlRetorno", "autorizar", "capturar",
		"campoLivre", "bin", "gerarToken" })
public class CriarRequisicaoTransacao extends RequisicaoTransacao {

	@XmlAttribute(name = "id")
	private UUID id = UUID.randomUUID();

	@XmlAttribute(name = "versao")
	private String version = "1.2.1";

	private DadosPortador dadosPortador;

	private DadosPedido dadosPedido;

	private FormaPagamento formaPagamento;

	@Length(max = 1024)
	private String urlRetorno;

	private Autorizar autorizar;

	private boolean capturar;

	private String campoLivre;

	private String bin;

	private boolean gerarToken;

	public CriarRequisicaoTransacao() {
		// TODO Auto-generated constructor stub
	}

	public CriarRequisicaoTransacao(DadosPortador dadosPortador, DadosPedido dadosPedido, FormaPagamento formaPagamento,
			String urlRetorno, Autorizar autorizar, boolean capturar, String campoLivre, String bin,
			boolean gerarToken) {
		super();
		this.dadosPortador = dadosPortador;
		this.dadosPedido = dadosPedido;
		this.formaPagamento = formaPagamento;
		this.urlRetorno = urlRetorno;
		this.autorizar = autorizar;
		this.capturar = capturar;
		this.campoLivre = campoLivre;
		this.bin = bin;
		this.gerarToken = gerarToken;
	}

	// GETTERS
	@XmlElement(name = "dados-portador")
	public DadosPortador getDadosPortador() {
		return dadosPortador;
	}

	@XmlElement(name = "dados-pedido")
	public DadosPedido getDadosPedido() {
		return dadosPedido;
	}

	@XmlElement(name = "forma-pagamento")
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	@XmlElement(name = "autorizar")
	public int getAutorizar() {
		return autorizar.getValor();
	}

	@XmlElement(name = "capturar")
	public boolean isCapturar() {
		return capturar;
	}

	@XmlElement(name = "campo-livre")
	public String getCampoLivre() {
		return campoLivre;
	}

	@XmlElement(name = "bin")
	public String getBin() {
		return bin;
	}

	@XmlElement(name = "gerar-token")
	public boolean isGerarToken() {
		return gerarToken;
	}

	@XmlElement(name = "url-retorno")
	public String getUrlRetorno() {
		return urlRetorno;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// SETTERS

	public void setDadosPortador(DadosPortador dadosPortador) {
		this.dadosPortador = dadosPortador;
	}

	public void setDadosPedido(DadosPedido dadosPedido) {
		this.dadosPedido = dadosPedido;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void setAutorizar(Autorizar autorizar) {
		this.autorizar = autorizar;
	}

	public void setCapturar(boolean capturar) {
		this.capturar = capturar;
	}

	public void setCampoLivre(String campoLivre) {
		this.campoLivre = campoLivre;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public void setGerarToken(boolean gerarToken) {
		this.gerarToken = gerarToken;
	}

	public void setUrlRetorno(String urlRetorno) {
		this.urlRetorno = urlRetorno;
	}

}