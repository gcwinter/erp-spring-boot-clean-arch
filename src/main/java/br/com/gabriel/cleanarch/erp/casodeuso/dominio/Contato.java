package br.com.gabriel.cleanarch.erp.casodeuso.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contato {

    private long id;
    private String nome;
    private String telefone;
    private String email;
    private String setor;
}

