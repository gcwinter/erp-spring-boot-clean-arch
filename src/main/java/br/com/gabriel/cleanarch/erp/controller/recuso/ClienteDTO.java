package br.com.gabriel.cleanarch.erp.controller.recuso;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Logradouro;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteDTO {

    private long id;
    private String nomeEmpresa;
    private LogradouroDTO logradouro = new LogradouroDTO();

    public ClienteDTO(Cliente cliente) {
        converte(cliente);
    }

    private ClienteDTO converte(Cliente cliente) {
        this.nomeEmpresa = cliente.getNomeEmpresa();
        LogradouroDTO logradouroDTO = new LogradouroDTO();
        logradouroDTO.setCep(cliente.getLogradouro().getCep());
        logradouroDTO.setCidade(cliente.getLogradouro().getCidade());
        logradouroDTO.setEndereco(cliente.getLogradouro().getEndereco());
        logradouroDTO.setNumero(cliente.getLogradouro().getNumero());
        logradouroDTO.setEstado(cliente.getLogradouro().getEstado());
        logradouroDTO.setId(cliente.getLogradouro().getId());
        this.logradouro = logradouroDTO;
        this.id = cliente.getId();
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
        //TODO vai ser implementado quando tiver contato
        /*      List<Contato> contatos = this.getContato()
                .stream()
                .map(ContatoDB::paraContato)
                .collect(Collectors.toList());
                cliente.setContato(contatos)*/

        return cliente;
    }

}
