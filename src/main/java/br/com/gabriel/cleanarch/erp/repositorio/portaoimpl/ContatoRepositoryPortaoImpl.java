package br.com.gabriel.cleanarch.erp.repositorio.portaoimpl;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ContatoRepositoryPortao;
import br.com.gabriel.cleanarch.erp.repositorio.ClienteRepository;
import br.com.gabriel.cleanarch.erp.repositorio.ContatoRepository;
import br.com.gabriel.cleanarch.erp.repositorio.recurso.ClienteDB;
import br.com.gabriel.cleanarch.erp.repositorio.recurso.ContatoDB;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ContatoRepositoryPortaoImpl implements ContatoRepositoryPortao {

    private final ContatoRepository contatoRepository;
    private final ClienteRepository clienteRepository;

    @Override
    public Contato update(Long id,Contato contato) {

        return null;
    }

    @Override
    public Contato buscar(Long id,Contato contato) {
        return null;
    }

    @Override
    public Contato save(Long id, Contato contato) {
        ClienteDB clienteDB = clienteRepository.findById(id).orElse(null);
        ContatoDB contatoDB = new ContatoDB(contato);
        clienteDB.adicionaContato(contatoDB);
        clienteRepository.save(clienteDB);
        clienteDB = clienteRepository.findById(id).orElse(null);
        contatoDB = clienteDB.getContato().get(clienteDB.getContato().size()-1);
        contato.setId(contatoDB.getId());
        return contato;
    }

    @Override
    public Contato excluir(Long id,Contato contato) {
        return null;
    }
}
