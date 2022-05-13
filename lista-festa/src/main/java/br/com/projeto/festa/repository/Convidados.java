package br.com.projeto.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.festa.model.Convidado;

public interface Convidados extends JpaRepository <Convidado, Long>  {

}
