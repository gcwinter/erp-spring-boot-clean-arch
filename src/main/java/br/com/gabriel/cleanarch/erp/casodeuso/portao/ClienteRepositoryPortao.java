package br.com.gabriel.cleanarch.erp.casodeuso.portao;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;

public interface ClienteRepositoryPortao {

    Cliente save(Cliente cliente);

    Cliente buscar(Cliente cliente);

    Cliente update(Cliente cliente);

    Cliente delete(Cliente cliente);
}
