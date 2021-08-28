package br.com.gabriel.MVC.ERP.casodeuso.portao;

import br.com.gabriel.MVC.ERP.casodeuso.recurso.Contato;

public interface ContatoDBPortao {
    Contato buscar( Contato contato);

    void excluir(Contato contatoQueVeioDoBanco);
}
