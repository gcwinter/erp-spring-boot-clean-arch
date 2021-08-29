package br.com.gabriel.cleanarch.erp.casodeuso.recurso;

public class FabricaDeCliente {
    private Cliente cliente;

    public FabricaDeCliente NomeEnderecoNumeroCepCidadeEstado
            (String nome, String endereco, String numero, String cep, String cidade, String estado) {
        this.cliente = new Cliente ( nome,new Logradouro(0,endereco, numero, cep, cidade, estado));
        return this;
    }


    public Cliente cadastrarNovoCliente() {
     return this.cliente;
    }
}
