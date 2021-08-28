package br.com.gabriel.MVC.ERP.repositorio.portaoimpl;

import br.com.gabriel.MVC.ERP.casodeuso.portao.ContatoDBPortao;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Cliente;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Contato;
import br.com.gabriel.MVC.ERP.repositorio.ContatoRepository;
import br.com.gabriel.MVC.ERP.repositorio.recurso.ClienteDB;
import br.com.gabriel.MVC.ERP.repositorio.recurso.ContatoDB;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ContatoDBPortaoImpl implements ContatoDBPortao {


    private final ContatoRepository contatoRepository;


    @Override
    public Contato buscar(Contato contato) {

        ContatoDB contatoDB = new ContatoDB(contato);
        ContatoDB contatoDBRetornado = contatoRepository.findByNome(contatoDB.getNome());
        Contato contatoRetornado = contatoDBRetornado.paraContato();
        return contatoRetornado;
    }

    @Override
    public void excluir(Contato contatoQueVeioDoBanco) {
        //TODO implementar
    }
}
