package br.com.gabriel.MVC.ERP.casodeuso.impl;

import br.com.gabriel.MVC.ERP.casodeuso.AtualizarClienteCasoDeUso;
import br.com.gabriel.MVC.ERP.casodeuso.BuscarClientePorFiltroCasoDeUso;
import br.com.gabriel.MVC.ERP.casodeuso.BuscarContatoPorFiltroCasoDeUso;
import br.com.gabriel.MVC.ERP.casodeuso.ExcluirContatoCasoDeUso;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Cliente;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Contato;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExcluirContatoCasoDeUso2Impl implements ExcluirContatoCasoDeUso {
    private final BuscarClientePorFiltroCasoDeUso buscarClientePorFiltroCasoDeUso;
    private final AtualizarClienteCasoDeUso atualizarClienteCasoDeUso;


    @Override
    public Cliente execute(Cliente cliente, Contato contato) {
        Cliente clienteComTodosOsContatos = buscarClientePorFiltroCasoDeUso.execute(cliente);

        clienteComTodosOsContatos.getContato().remove(contato);
        atualizarClienteCasoDeUso.execute(clienteComTodosOsContatos);
        return clienteComTodosOsContatos;
    }
}
