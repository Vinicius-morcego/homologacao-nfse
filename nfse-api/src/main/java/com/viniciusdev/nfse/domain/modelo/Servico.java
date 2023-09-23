package com.viniciusdev.nfse.domain.modelo;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.EqualsExclude;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Servico {

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer aliquota;
	private String discriminacao;
	private String issRetido;
	private String itemListaServico;
	private String codigoTributarioMunicipio;
	private BigDecimal valorServicos;
}
