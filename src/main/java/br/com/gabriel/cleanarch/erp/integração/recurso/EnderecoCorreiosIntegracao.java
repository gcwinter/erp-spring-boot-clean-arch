package br.com.gabriel.cleanarch.erp.integração.recurso;


import lombok.Data;

@Data
public class EnderecoCorreiosIntegracao {
   /* {
        "cep": "09210-300",
            "logradouro": "Avenida Estados Unidos",
            "complemento": "",
            "bairro": "Parque das Nações",
            "localidade": "Santo André",
            "uf": "SP",
            "ibge": "3547809",
            "gia": "6269",
            "ddd": "11",
            "siafi": "7057"
    }*/

    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String logradouro;
    private String tipodelogradouro;

}
