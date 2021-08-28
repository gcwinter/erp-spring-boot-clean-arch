package br.com.gabriel.MVC.ERP.repositorio;

import br.com.gabriel.MVC.ERP.repositorio.recurso.ClienteDB;
import br.com.gabriel.MVC.ERP.repositorio.recurso.ContatoDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoDB, Long> {

    ContatoDB findByNome(String nome);
}
