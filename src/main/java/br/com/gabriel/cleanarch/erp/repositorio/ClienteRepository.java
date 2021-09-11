package br.com.gabriel.cleanarch.erp.repositorio;

import br.com.gabriel.cleanarch.erp.repositorio.recurso.ClienteDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDB, Long> {

    ClienteDB findByNomeEmpresa(String nomeEmpresa);
}
