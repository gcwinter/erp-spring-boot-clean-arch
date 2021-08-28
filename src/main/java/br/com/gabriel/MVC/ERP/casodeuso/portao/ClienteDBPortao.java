package br.com.gabriel.MVC.ERP.casodeuso.portao;

import br.com.gabriel.MVC.ERP.casodeuso.recurso.Cliente;

public interface ClienteDBPortao {

    Cliente save (Cliente cliente);


    Cliente buscar(Cliente cliente);
}
