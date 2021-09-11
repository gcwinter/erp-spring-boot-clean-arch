package br.com.gabriel.cleanarch.erp.integração.portaoimpl;

import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Logradouro;
import br.com.gabriel.cleanarch.erp.integração.ApiCorreios;
import br.com.gabriel.cleanarch.erp.integração.recurso.EnderecoCorreiosIntegracao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ApiCepIntegracaoPortaoImpl  {

    private final ApiCorreios apiCorreios;


    public Logradouro buscarCep(String cep) {
        EnderecoCorreiosIntegracao enderecoCorreiosIntegracao = apiCorreios.buscarCep(cep);
        //TODO converter retorno API correios para Logradouro

        return null;// TODO devolver logradouro
    }
}
