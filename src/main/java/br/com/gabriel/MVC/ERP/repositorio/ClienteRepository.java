package br.com.gabriel.MVC.ERP.repositorio;

import br.com.gabriel.MVC.ERP.casodeuso.recurso.Cliente;
import br.com.gabriel.MVC.ERP.repositorio.recurso.ClienteDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDB, Long> {

    ClienteDB findByNomeEmpresa(String nomeEmpresa);
}
