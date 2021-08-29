package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.BuscarClientePorFiltroCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.BuscarContatoPorFiltroCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.ExcluirContatoCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ContatoDBPortao;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Contato;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExcluirContatoCasoDeUsoImpl implements ExcluirContatoCasoDeUso {
    private final BuscarClientePorFiltroCasoDeUso buscarClientePorFiltroCasoDeUso;
    private final BuscarContatoPorFiltroCasoDeUso buscarContatoPorFiltroCasoDeUso;
    private final ContatoDBPortao contatoDBPortao;


    @Override
    public Cliente execute(Cliente cliente, Contato contato) {
        Cliente clienteComTodosOsContatos = buscarClientePorFiltroCasoDeUso.execute(cliente);
        Contato contatoQueVeioDoBanco = buscarContatoPorFiltroCasoDeUso.execute(contato);
        contatoDBPortao.excluir(contatoQueVeioDoBanco);
        clienteComTodosOsContatos.getContato().remove(contatoQueVeioDoBanco);

        return clienteComTodosOsContatos;
    }
}
