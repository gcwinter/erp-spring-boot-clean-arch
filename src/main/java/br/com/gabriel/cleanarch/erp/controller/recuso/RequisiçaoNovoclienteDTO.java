package br.com.gabriel.cleanarch.erp.controller.recuso;

import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.FabricaDeCliente;

public class RequisiçaoNovoclienteDTO {
    private String nomeEmpresa;
    private String enderecoEmpresa;
    private String numeroEmpresa;
    private String cepEmpresa;
    private String estadoEmpresa;
    private String cidadeEmpresa;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public String getNumeroEmpresa() {
        return numeroEmpresa;
    }

    public void setNumeroEmpresa(String numeroEmpresa) {
        this.numeroEmpresa = numeroEmpresa;
    }

    public String getCepEmpresa() {
        return cepEmpresa;
    }

    public void setCepEmpresa(String cepEmpresa) {
        this.cepEmpresa = cepEmpresa;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public String getCidadeEmpresa() {
        return cidadeEmpresa;
    }

    public void setCidadeEmpresa(String cidadeEmpresa) {
        this.cidadeEmpresa = cidadeEmpresa;
    }

    public Cliente criaCliente() {
        FabricaDeCliente fabricaDeCliente = new FabricaDeCliente();
        Cliente cliente = fabricaDeCliente.NomeEnderecoNumeroCepCidadeEstado(getNomeEmpresa(),
                        getEnderecoEmpresa(), getNumeroEmpresa(), getCepEmpresa(),
                        getCidadeEmpresa(), getEstadoEmpresa())
                .cadastrarNovoCliente();
        return cliente;
    }

}
