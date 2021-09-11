package br.com.gabriel.cleanarch.erp.integração.portaoimpl;

import br.com.gabriel.cleanarch.erp.casodeuso.portao.ApiCepIntegracaoPortao;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Logradouro;
import br.com.gabriel.cleanarch.erp.integração.ApiCorreios;
import br.com.gabriel.cleanarch.erp.integração.recurso.EnderecoCorreiosIntegracao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ApiCepIntegracaoPortaoImpl implements ApiCepIntegracaoPortao {

    private final ApiCorreios apiCorreios;

    @Override
    public Logradouro buscarCep(String cep) {
        EnderecoCorreiosIntegracao enderecoCorreiosIntegracao = apiCorreios.buscarCep(cep);
        //TODO converter retorno API correios para Logradouro

        return null;// TODO devolver logradouro
    }
}
