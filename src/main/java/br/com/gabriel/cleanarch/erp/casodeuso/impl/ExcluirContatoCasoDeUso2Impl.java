package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.AtualizarClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.BuscarClientePorFiltroCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.ExcluirContatoCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Contato;
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
