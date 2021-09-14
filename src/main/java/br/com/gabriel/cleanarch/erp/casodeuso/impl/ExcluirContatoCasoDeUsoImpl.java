package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.ExcluirContatoCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ContatoRepositoryPortao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExcluirContatoCasoDeUsoImpl implements ExcluirContatoCasoDeUso {

    private final ContatoRepositoryPortao contatoRepositoryPortao;

    @Override
    public Contato execute(Long id, Contato contato) {
        return contatoRepositoryPortao.excluir(id,contato);
    }
}
