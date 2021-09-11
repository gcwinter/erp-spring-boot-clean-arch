package br.com.gabriel.cleanarch.erp.repositorio.portaoimpl;

import br.com.gabriel.cleanarch.erp.casodeuso.portao.ClienteDBPortao;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import br.com.gabriel.cleanarch.erp.repositorio.ClienteRepository;
import br.com.gabriel.cleanarch.erp.repositorio.recurso.ClienteDB;
import org.springframework.stereotype.Component;

@Component
public class ClienteDBPortaoImpl implements ClienteDBPortao {

    private final ClienteRepository clienteRepository;

    public ClienteDBPortaoImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente save(Cliente cliente) {
        ClienteDB clienteDB = new ClienteDB(cliente);
        ClienteDB clienteDBSalvo = clienteRepository.save(clienteDB);
        cliente.getLogradouro().setId(clienteDBSalvo.getLogradouro().getId());
        cliente.setId(clienteDBSalvo.getId());
        return cliente;

    }

    @Override
    public Cliente buscar(Cliente cliente) {
        ClienteDB clienteDB = new ClienteDB(cliente);
        ClienteDB clienteDBRetornado = clienteRepository.findByNomeEmpresa(clienteDB.getNomeEmpresa());
        Cliente clienteComContatos = clienteDBRetornado.paraCliente();
        return clienteComContatos;


    }


}
