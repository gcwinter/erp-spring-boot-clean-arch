package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.ExcluirClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ClienteRepositoryPortao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExcluirClienteCasoDeUsoImpl implements ExcluirClienteCasoDeUso {

    private final ClienteRepositoryPortao clienteRepositoryPortao;


    @Override
    public Cliente execute(Cliente cliente) {

        return clienteRepositoryPortao.delete(cliente);
    }
}
