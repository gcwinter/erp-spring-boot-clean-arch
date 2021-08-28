package br.com.gabriel.MVC.ERP.casodeuso.portao;

import br.com.gabriel.MVC.ERP.casodeuso.recurso.Logradouro;

public interface ApiCepIntegracaoPortao {
    Logradouro buscarCep(String cep);
}
