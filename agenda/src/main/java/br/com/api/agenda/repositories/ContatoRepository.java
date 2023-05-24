package br.com.api.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.agenda.domain.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
