package br.com.gabriel.MVC.ERP.integração;

import br.com.gabriel.MVC.ERP.integração.recurso.EnderecoCorreiosIntegracao;

public interface ApiCorreios {

    EnderecoCorreiosIntegracao buscarCep(String cep);
}
