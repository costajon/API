package br.com.api.farmacia.fornecedor.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "forn_cd_id")
	private Long idFornecedor;

	@Column(name = "forn_tx_cnpj", nullable = false, unique = true, length = 14)
	private String cnpj;

	
	@Column(name = "forn_tx_nome", nullable = false)
	private String nome;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "forn_dt_dtregistro", nullable = false)
	private LocalDateTime dataRegistro;

	
	@Column(name = "forn_tx_end", nullable = false)
	private String endereco;

	@Column(name = "forn_bl_ativo", nullable = false)
	private boolean ativo;

	public Fornecedor() {

	}

	public Fornecedor(Long idFornecedor, String cnpj, String nome, LocalDateTime dataRegistro, String endereco,
			boolean ativo) {

		this.idFornecedor = idFornecedor;
		this.cnpj = cnpj;
		this.nome = nome;
		this.dataRegistro = dataRegistro;
		this.endereco = endereco;
		this.ativo = ativo;
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
