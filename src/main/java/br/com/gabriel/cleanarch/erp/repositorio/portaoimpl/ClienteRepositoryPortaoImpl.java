package br.com.gabriel.cleanarch.erp.repositorio.portaoimpl;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ClienteRepositoryPortao;
import br.com.gabriel.cleanarch.erp.repositorio.ClienteRepository;
import br.com.gabriel.cleanarch.erp.repositorio.recurso.ClienteDB;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
@AllArgsConstructor
public class ClienteRepositoryPortaoImpl implements ClienteRepositoryPortao {

    private final ClienteRepository clienteRepository;


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
        if(isNull(clienteDBRetornado)){
            return new Cliente();
        }
        Cliente clienteComContatos = clienteDBRetornado.paraCliente();
        return clienteComContatos;
    }

    @Override
    public Cliente update(Cliente cliente) {
        ClienteDB clienteDB = new ClienteDB(cliente);
        ClienteDB clienteDoBanco = clienteRepository.findById(clienteDB.getId()).get();
        clienteDoBanco.setContato(clienteDB.getContato());
        clienteDoBanco.setLogradouro(clienteDB.getLogradouro());
        clienteDoBanco.setNomeEmpresa(clienteDB.getNomeEmpresa());
        ClienteDB clienteDBSalvo = clienteRepository.save(clienteDB);
        return clienteDBSalvo.paraCliente();
    }

    @Override
    public Cliente delete(Cliente cliente) {
        ClienteDB clienteDB = new ClienteDB(cliente);
        clienteRepository.deleteById(clienteDB.getId());
        return new Cliente();
    }


}
