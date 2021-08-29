package br.com.gabriel.cleanarch.erp.repositorio;

import br.com.gabriel.cleanarch.erp.repositorio.recurso.ContatoDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoDB, Long> {

    ContatoDB findByNome(String nome);
}
