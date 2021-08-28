package br.com.gabriel.MVC.ERP.casodeuso.impl;

import br.com.gabriel.MVC.ERP.casodeuso.BuscarContatoPorFiltroCasoDeUso;
import br.com.gabriel.MVC.ERP.casodeuso.portao.ContatoDBPortao;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Contato;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuscarContatoPorFiltroCasoDeUsoImpl implements BuscarContatoPorFiltroCasoDeUso {

    private final ContatoDBPortao contatoDBPortao;

    @Override
    public Contato execute(Contato contato) {
        return contatoDBPortao.buscar(contato);

    }
}
