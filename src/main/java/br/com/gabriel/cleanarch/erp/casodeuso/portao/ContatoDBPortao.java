package br.com.gabriel.cleanarch.erp.casodeuso.portao;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Contato;

public interface ContatoDBPortao {
    Contato buscar( Contato contato);

    void excluir(Contato contatoQueVeioDoBanco);
}
