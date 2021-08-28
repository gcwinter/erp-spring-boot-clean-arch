package br.com.gabriel.MVC.ERP.casodeuso.recurso;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logradouro {

    private long id;
    private String cep;
    private String endereco;
    private String numero;
    private String cidade;
    private String estado;

}