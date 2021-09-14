package br.com.gabriel.cleanarch.erp.casodeuso.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private long id;

    private String nomeEmpresa;
    private Logradouro logradouro = new Logradouro();
    private List<Contato> contato = new ArrayList<>();
    private String cnpj;

    public Cliente(String nome, Logradouro logradouro) {
        this.nomeEmpresa = nome;
        this.logradouro = logradouro;
    }

}
