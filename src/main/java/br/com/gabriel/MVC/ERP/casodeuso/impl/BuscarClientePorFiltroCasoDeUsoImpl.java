package br.com.gabriel.MVC.ERP.casodeuso.impl;

import br.com.gabriel.MVC.ERP.casodeuso.BuscarClientePorFiltroCasoDeUso;
import br.com.gabriel.MVC.ERP.casodeuso.portao.ClienteDBPortao;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Cliente;
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
