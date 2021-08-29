package br.com.gabriel.cleanarch.erp.casodeuso.portao;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Logradouro;

public interface ApiCepIntegracaoPortao {
    Logradouro buscarCep(String cep);
}
