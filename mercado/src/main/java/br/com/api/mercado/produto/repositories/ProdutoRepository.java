package br.com.api.mercado.produto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.api.mercado.produto.domain.Produto;

public interface ProdutoRepository extends  JpaRepository<Produto,Long> {
	

}
