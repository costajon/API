package br.com.api.farmacia.fornecedor.services;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.api.farmacia.fornecedor.domain.Fornecedor;
import br.com.api.farmacia.fornecedor.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	FornecedorRepository fornecedorRepository;

	public Fornecedor buscarFornecedor(String cnpj) {
		if(fornecedorRepository.buscarFornecedor(cnpj)!=null){
			return fornecedorRepository.buscarFornecedor(cnpj);
		}else
		{
			throw new IllegalArgumentException("Fornecedor não encontrado com a matrícula fornecida.");
		}
	}

	public Fornecedor inserirFornecedor(Fornecedor fornecedor) {
		if ((fornecedor.getNome() == null || fornecedor.getNome().isEmpty()) && 
			(fornecedor.getCnpj() == null || fornecedor.getCnpj().isEmpty()) &&
			(fornecedor.getEndereco() == null || fornecedor.getEndereco().isEmpty()))
			 {
			throw new IllegalArgumentException("O nome, CNPJ e Endereço do fornecedor são campos obrigatório.");
		}
		
		fornecedor.setDataRegistro(LocalDateTime.now());
		return fornecedorRepository.save(fornecedor);
	}

	public List<Fornecedor> listarFornecedores() {
		List<Fornecedor> fornecedores = fornecedorRepository.findAll();
		Collections.sort(fornecedores, Comparator.comparing(Fornecedor::getNome));
		return fornecedores;
	}

	public Fornecedor atualizarFornecedor(String cnpj, Fornecedor fornecedorSolicitante) {
		Fornecedor fornecedorExistente = fornecedorRepository.buscarFornecedor(cnpj);

		if (fornecedorExistente != null) {
			fornecedorExistente.setNome(fornecedorSolicitante.getNome());
			fornecedorExistente.setCnpj(fornecedorSolicitante.getCnpj());
			fornecedorExistente.setEndereco(fornecedorSolicitante.getEndereco());

			return fornecedorRepository.save(fornecedorExistente);
		} else {
			throw new IllegalArgumentException("Fornecedor não encontrado com o CNPJ informado.");
		}

	}

	public Fornecedor inativarFornecedor(String cnpj) {
		Fornecedor fornecedor = fornecedorRepository.buscarFornecedor(cnpj);
		if (fornecedor != null) {
			fornecedor.setAtivo(false);
			return fornecedorRepository.save(fornecedor);
		} else {
			throw new IllegalArgumentException("Fornecedor não encontrado com o CNPJ informado.");
		}

	}
	

}
