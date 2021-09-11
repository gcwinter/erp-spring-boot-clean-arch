package br.com.gabriel.cleanarch.erp.repositorio.recurso;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatoDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String telefone;
    private String email;
    private String setor;

    public ContatoDB(Contato contato) {
        convert(contato);

    }

    private ContatoDB convert(Contato contato) {
        this.setEmail(contato.getEmail());
        this.setNome(contato.getNome());
        this.setSetor(contato.getSetor());
        this.setTelefone(contato.getTelefone());
        return this;
    }

    public Contato paraContato() {
        Contato contato = new Contato();
        contato.setEmail(this.getEmail());
        contato.setNome(this.getNome());
        contato.setSetor(this.getSetor());
        contato.setTelefone(this.getTelefone());
        return contato;

    }
}
