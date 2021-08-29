package br.com.gabriel.cleanarch.erp.casodeuso;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Contato;

public interface ExcluirContatoCasoDeUso {

    Cliente execute(Cliente cliente ,Contato contato );
}
