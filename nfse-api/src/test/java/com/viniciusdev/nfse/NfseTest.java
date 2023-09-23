package com.viniciusdev.nfse;

import com.viniciusdev.nfse.domain.modelo.Endereco;
import com.viniciusdev.nfse.domain.modelo.IdentificadorNFSE;
import com.viniciusdev.nfse.domain.modelo.IdentificadorRPS;
import com.viniciusdev.nfse.domain.modelo.Prestador;
import com.viniciusdev.nfse.domain.modelo.Tomador;

public class NfseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private IdentificadorNFSE criarIdentificadorNfse() {
		IdentificadorNFSE idNfse = new IdentificadorNFSE();
		idNfse.setNumero("000001");
		return idNfse;
	}
	
	private IdentificadorRPS criarIdentificadorRps() {
		IdentificadorRPS idRps = new IdentificadorRPS();
		idRps.setSituacaoTrib(null);
		idRps.setProducao(2);
		idRps.setStatus(1);
		idRps.setOutrasInformacoes("");
		
		return idRps;
	}
	
	private Endereco criarEndereco() {
		Endereco endereco = new Endereco();
		endereco.setCodigoMunicipio("123456");
		endereco.setCep("38270000");
		endereco.setLogradouro("rua juca teixeira");
		endereco.setNumero("264");
		endereco.setBairro("senhor teixeira");
		endereco.setComplemento("proximo ao pratico supermercado");
		endereco.setUf("MG");
		return endereco;
	}
	
	private Prestador criarPrestador() {
		Prestador prestador = new Prestador();
		prestador.setCnpj("00000000000000");
		prestador.setCodigoMunicipio("123456");
		prestador.setInscricaoMunicipal("12345678");
		return prestador;
	}
	
	private Tomador criarTomador() {
		Tomador tomador = new Tomador();
		Endereco endereco = criarEndereco();
		tomador.setCnpj("00000000000000");
		tomador.setRazaoSocial("TOMADOR RAZAO SOCIAO ME");
		tomador.setEmail("email.tomador@teste.com");
		tomador.setEndereco(endereco);
		return tomador;
	}
	

}
