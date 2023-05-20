package br.com.api.farmacia.fornecedor.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.api.farmacia.fornecedor.domain.Fornecedor;
import br.com.api.farmacia.fornecedor.services.FornecedorService;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	@Autowired
	FornecedorService fornecedorService;

	@PostMapping
	public Fornecedor cadastrarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.inserirFornecedor(fornecedor);
	}

	@GetMapping("/{id}")
	public Fornecedor buscarFornecedorPorCNPJ(@PathVariable ("id") String cnpj) {
		return fornecedorService.buscarFornecedor(cnpj);
	}

	
	@GetMapping
	public List<Fornecedor> listarFornecedores() {
		return fornecedorService.listarFornecedores();
	}

	@PutMapping("/{id}")
    public Fornecedor atualizarFornecedor(@PathVariable("id") String cnpj,  @RequestBody Fornecedor fornecedorSolicitante) {
        return fornecedorService.atualizarFornecedor(cnpj, fornecedorSolicitante);
    }

	@DeleteMapping("/{id}")
	public Fornecedor inativarFornecedor(@PathVariable("id") String cnpj) {
		return fornecedorService.inativarFornecedor(cnpj);

	}
}
