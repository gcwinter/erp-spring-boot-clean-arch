package br.com.gabriel.cleanarch.erp.casodeuso.portao;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;

public interface ClienteDBPortao {

    Cliente save (Cliente cliente);


    Cliente buscar(Cliente cliente);
}
