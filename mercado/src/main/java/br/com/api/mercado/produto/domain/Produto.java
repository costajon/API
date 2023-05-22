package br.com.api.mercado.produto.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_cd_id")
    private Long id;

    @Column(name = "prod_tx_nome", nullable = false)
    private String nome;
    
    @Column(name = "prod_tx_descricao", nullable = false)
    private String descricao;
    
    @Column(name = "prod_nm_preco", nullable = false)
    private double preco;
    
	@Column(name = "prod_bl_ativo", nullable = false)
	private boolean ativo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "prod_dt_dtregistro", nullable = false)
	private LocalDateTime dataRegistro;
    
    public Produto() {
    }

	public Produto(Long id, String nome, String descricao, double preco, boolean ativo, LocalDateTime dataRegistro) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.ativo = ativo;
		this.dataRegistro = dataRegistro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
    
	
    
    

}
