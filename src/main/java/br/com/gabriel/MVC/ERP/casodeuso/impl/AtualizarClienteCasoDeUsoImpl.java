package br.com.gabriel.MVC.ERP.casodeuso.impl;

import br.com.gabriel.MVC.ERP.casodeuso.AtualizarClienteCasoDeUso;
import br.com.gabriel.MVC.ERP.casodeuso.portao.ApiCepIntegracaoPortao;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Cliente;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Logradouro;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AtualizarClienteCasoDeUsoImpl implements AtualizarClienteCasoDeUso {

    private final ApiCepIntegracaoPortao apiCepIntegracaoPortao;

    @Override
    public Cliente execute(Cliente cliente) {

        Logradouro logradouro = apiCepIntegracaoPortao.buscarCep(cliente.getLogradouro().getCep());
        cliente.setLogradouro(logradouro);

        //TODO atualizar cliente no banco de dados
        return null;
    }


}
