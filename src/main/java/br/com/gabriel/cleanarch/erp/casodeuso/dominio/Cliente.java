package br.com.gabriel.cleanarch.erp.casodeuso.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Cliente {

    private long id;

    private String nomeEmpresa;
    private Logradouro logradouro = new Logradouro();
    private List<Contato> contato = new ArrayList<>();
    private LocalDate dataDeNascimento;
    private int idade;

    public Cliente() {
    }

    public Cliente(String nome, Logradouro logradouro) {
        this.nomeEmpresa = nome;
        this.logradouro = logradouro;
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

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public List<Contato> getContato() {
        return contato;
    }

    public void setContato(List<Contato> contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", logradouro=" + logradouro +
                ", contato=" + contato +
                '}';
    }
}
