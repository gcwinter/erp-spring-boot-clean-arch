package br.com.gabriel.cleanarch.erp.controller.recuso;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Contato;

public class RequisicaoNovoContatoDTO {

    private String nomeEmpresa;
    private String nomeContato;
    private String setorContato;
    private String emailContato;
    private String telefoneContato;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getSetorContato() {
        return setorContato;
    }

    public void setSetorContato(String setorContato) {
        this.setorContato = setorContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public Contato criarContato() {
        Contato contato = new Contato();
        contato.setNome(nomeContato);
        contato.setEmail(emailContato);
        contato.setSetor(setorContato);
        contato.setTelefone(telefoneContato);
        return contato;

    }

}
