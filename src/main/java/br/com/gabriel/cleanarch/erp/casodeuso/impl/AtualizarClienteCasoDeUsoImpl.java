package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.AtualizarClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ClienteRepositoryPortao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AtualizarClienteCasoDeUsoImpl implements AtualizarClienteCasoDeUso {

    private final ClienteRepositoryPortao clienteRepositoryPortao;
    //TODO buscar cliente antes de atualizar


    public Cliente execute(Cliente cliente) {

        return clienteRepositoryPortao.update(cliente);

    }


}
