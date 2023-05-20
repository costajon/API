package br.com.api.farmacia.fornecedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.api.farmacia.fornecedor.domain.Fornecedor;

@Repository("fornecedor")
public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {

	@Query("SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj")
	Fornecedor buscarFornecedor(String cnpj);


}


