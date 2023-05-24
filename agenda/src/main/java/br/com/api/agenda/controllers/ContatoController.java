package br.com.api.agenda.controllers;

import br.com.api.agenda.domain.Contato;
import br.com.api.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    ContatoService contatoService;

    @GetMapping
    public List<Contato> buscarContatos() {
        return contatoService.buscarContatos();
    }

    @GetMapping("/{id}")
    public Contato getContatoById(@PathVariable Long id) {
        return contatoService.buscarContatoPorId(id);
    }

    @PostMapping
    public Contato createContato(@RequestBody Contato contato) {
        return contatoService.cadastrarContato(contato);
    }

    @PutMapping("/{id}")
    public Contato updateContato(@PathVariable Long id, @RequestBody Contato contato) {
        return contatoService.atualizarContato(id, contato);
    }

    @DeleteMapping("/{id}")
    public void deletarContato(@PathVariable Long id) {
        contatoService.deletarContato(id);
    }
}