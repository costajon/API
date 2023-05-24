package br.com.api.agenda.services;

import br.com.api.agenda.domain.Contato;
import br.com.api.agenda.repositories.ContatoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ContatoService {
    

    @Autowired
    ContatoRepository contatoRepository;
   

    public List<Contato> buscarContatos() {
        return contatoRepository.findAll();
    }

    public Contato buscarContatoPorId(Long id) {
        return contatoRepository.findById(id).orElse(null);
    }

    public Contato cadastrarContato(Contato contato) {
    	if ((contato.getNome() == null || contato.getNome().isEmpty())
				&& (contato.getTelefone() == null || contato.getTelefone().isEmpty())) 
    	{
			throw new IllegalArgumentException("O nome, descrição e valor do produto são campos obrigatório.");
		}

        return contatoRepository.save(contato);
    }

    public Contato atualizarContato(Long id, Contato contato) {
        Contato contatoExistente = contatoRepository.findById(id).orElse(null);
        if (contatoExistente != null) {
            contato.setId(contatoExistente.getId());
            return contatoRepository.save(contato);
        }
        return null;
    }

    public Contato deletarContato(Long id) {
    	Contato contato = contatoRepository.findById(id).orElse(null);
		if (contato != null) {
			contatoRepository.delete(contato);
		}
		return null;
    }
}