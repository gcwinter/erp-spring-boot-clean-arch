package br.com.gabriel.cleanarch.erp.casodeuso.portao;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;
import br.com.gabriel.cleanarch.erp.repositorio.recurso.ContatoDB;

public interface ContatoRepositoryPortao {

    Contato update(Long id, Contato contato);

    Contato buscar(Long id,Contato contato);

    Contato save(Long id, Contato contato);

    Contato excluir (Long id, Contato contato);
}
