package br.com.gabriel.cleanarch.erp.repositorio.recurso;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Contato;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Logradouro;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
public class ClienteDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeEmpresa;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "logradouro_id", referencedColumnName = "id")
    private LogradouroDB logradouro;
    @OneToMany(targetEntity = ContatoDB.class, cascade = CascadeType.ALL)
    private List<ContatoDB> contato;

    public ClienteDB(Cliente cliente) {
        converte(cliente);
    }

    private ClienteDB converte(Cliente cliente) {
        this.nomeEmpresa = cliente.getNomeEmpresa();
        LogradouroDB logradouroDB = new LogradouroDB();
        logradouroDB.setCep(cliente.getLogradouro().getCep());
        logradouroDB.setCidade(cliente.getLogradouro().getCidade());
        logradouroDB.setEndereco(cliente.getLogradouro().getEndereco());
        logradouroDB.setNumero(cliente.getLogradouro().getNumero());
        logradouroDB.setEstado(cliente.getLogradouro().getEstado());
        this.logradouro = logradouroDB;

        return this;

    }


    public Cliente paraCliente() {
        Cliente cliente = new Cliente();
        cliente.setId(this.id);
        cliente.setNomeEmpresa(this.nomeEmpresa);
        Logradouro logradouro = new Logradouro();
        logradouro.setCep(this.getLogradouro().getCep());
        logradouro.setCidade(this.getLogradouro().getCidade());
        logradouro.setEndereco(this.getLogradouro().getEndereco());
        logradouro.setNumero(this.getLogradouro().getNumero());
        logradouro.setEstado(this.getLogradouro().getEstado());
        logradouro.setId(this.getLogradouro().getId());
        cliente.setLogradouro(logradouro);
        List<Contato> contatos = this.getContato()
                .stream()
                .map(ContatoDB::paraContato)
                .collect(Collectors.toList());
        cliente.setContato(contatos);
        return cliente;
    }

}
