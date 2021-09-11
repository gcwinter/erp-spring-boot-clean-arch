package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.CadastrarNovoClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ClienteDBPortao;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import org.springframework.stereotype.Service;

@Service
public class CadastrarNovoClienteCasoDeUsoImpl implements CadastrarNovoClienteCasoDeUso {

    private final ClienteDBPortao clienteDBPortao;

    public CadastrarNovoClienteCasoDeUsoImpl(ClienteDBPortao clienteDBPortao) {
        this.clienteDBPortao = clienteDBPortao;
    }

    @Override
    public Cliente execute(Cliente cliente) {
        return clienteDBPortao.save(cliente);
    }
}
