package br.com.gabriel.cleanarch.erp.controller.recuso;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatoDTO {

    private long id;
    private String nome;
    private String telefone;
    private String email;
    private String setor;

    public ContatoDTO(Contato contato) {
        converter(contato);

    }

    private ContatoDTO converter(Contato contato) {
        this.nome = contato.getNome();
        this.telefone = contato.getTelefone();
        this.email = contato.getEmail();
        this.setor = contato.getSetor();
        this.id = contato.getId();
        return this;
    }

    public Contato paraContato() {
        Contato contato = new Contato();
        contato.setId(this.getId());
        contato.setNome(this.getNome());
        contato.setTelefone(this.getTelefone());
        contato.setEmail(this.getEmail());
        contato.setSetor(this.getSetor());
        return contato;


    }
}

