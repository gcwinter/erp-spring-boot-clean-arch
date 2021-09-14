package br.com.gabriel.cleanarch.erp.casodeuso;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;

public interface CadastrarContatoCasoDeUso {

    Contato execute(Long id,Contato contato);
}
