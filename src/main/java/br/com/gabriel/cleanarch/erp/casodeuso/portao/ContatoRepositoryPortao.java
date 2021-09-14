package br.com.gabriel.cleanarch.erp.casodeuso.portao;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;

public interface ContatoRepositoryPortao {

    Contato update(Contato contato);

    Contato buscar(Contato contato);

    Contato save(Contato contato);

    Contato excluir (Contato contato);
}
