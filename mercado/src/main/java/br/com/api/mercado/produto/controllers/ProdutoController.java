package br.com.api.mercado.produto.controllers;


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

import br.com.api.mercado.produto.domain.Produto;
import br.com.api.mercado.produto.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoService.inserirProduto(produto);
    }

    @GetMapping("/{id}")
    public Produto buscarProdutoPorId(@PathVariable("id") Long id) {
        return produtoService.buscarProdutoPorId(id);
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable("id") Long id, @RequestBody Produto produto) {
        return produtoService.atualizarProduto(id, produto);
    }

    @DeleteMapping("/{id}")
    public Produto inativarProduto(@PathVariable("id") Long id) {
        return produtoService.inativarProduto(id);
    }
}