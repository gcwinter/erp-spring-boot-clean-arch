package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.BuscarClientePorFiltroCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ClienteDBPortao;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuscarClientePorFiltroCasoDeUsoImpl implements BuscarClientePorFiltroCasoDeUso {

    private final ClienteDBPortao clienteDBPortao;

    @Override
    public Cliente execute(Cliente cliente) {

        return clienteDBPortao.buscar(cliente);
    }
}
