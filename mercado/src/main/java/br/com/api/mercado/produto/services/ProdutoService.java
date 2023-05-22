package br.com.api.mercado.produto.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.mercado.produto.domain.Produto;
import br.com.api.mercado.produto.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto inserirProduto(Produto produto) {

		if ((produto.getNome() == null || produto.getNome().isEmpty())
				&& (produto.getDescricao() == null || produto.getDescricao().isEmpty()) && (produto.getPreco() != 0.0)
				&& produto.getPreco() > 0.0) {
			throw new IllegalArgumentException("O nome, descrição e valor do produto são campos obrigatório.");
		}

		produto.setDataRegistro(LocalDateTime.now());
		return produtoRepository.save(produto);

	}

	public Produto buscarProdutoPorId(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}

	public Produto atualizarProduto(Long id, Produto produto) {
		Produto produtoExistente = produtoRepository.findById(id).orElse(null);
		if (produtoExistente != null) {
			produto.setId(produtoExistente.getId());
			return produtoRepository.save(produto);
		}
		return null;
	}

	public Produto inativarProduto(Long id) {
		Produto produto = produtoRepository.findById(id).orElse(null);
		if (produto != null) {
			produto.setAtivo(false);
			return produtoRepository.save(produto);
		}
		return null;
	}
}