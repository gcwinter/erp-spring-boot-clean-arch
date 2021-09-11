package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.BuscarContatoPorFiltroCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ContatoDBPortao;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Contato;
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
