package br.com.gabriel.MVC.ERP.Controller.recuso;

import br.com.gabriel.MVC.ERP.casodeuso.recurso.Cliente;

public class ClienteDTO {

    private long id;
    private String nomeEmpresa;
    private LogradouroDTO logradouro;

    public ClienteDTO(Cliente cliente) {
        converte(cliente);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public LogradouroDTO getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(LogradouroDTO logradouro) {
        this.logradouro = logradouro;
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
}
