package br.com.gabriel.cleanarch.erp.integração;

import br.com.gabriel.cleanarch.erp.integração.recurso.EnderecoCorreiosIntegracao;

public interface ApiCorreios {

    EnderecoCorreiosIntegracao buscarCep(String cep);
}
