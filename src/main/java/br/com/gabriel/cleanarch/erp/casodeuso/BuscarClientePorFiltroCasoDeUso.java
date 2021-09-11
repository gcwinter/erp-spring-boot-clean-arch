package br.com.gabriel.cleanarch.erp.casodeuso;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;

public interface BuscarClientePorFiltroCasoDeUso {

    Cliente execute(Cliente cliente);
}
