package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.AtualizaContatoCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ContatoRepositoryPortao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AtualizarContatoCasoDeUsoImpl implements AtualizaContatoCasoDeUso {

    private ContatoRepositoryPortao contatoRepositoryPortao;

    @Override
    public Contato execute(Contato contato) {

        return contatoRepositoryPortao.update(contato);
    }
}