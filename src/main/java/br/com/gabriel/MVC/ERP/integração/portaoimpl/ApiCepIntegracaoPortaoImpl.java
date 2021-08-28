package br.com.gabriel.MVC.ERP.integração.portaoimpl;

import br.com.gabriel.MVC.ERP.casodeuso.portao.ApiCepIntegracaoPortao;
import br.com.gabriel.MVC.ERP.casodeuso.recurso.Logradouro;
import br.com.gabriel.MVC.ERP.integração.ApiCorreios;
import br.com.gabriel.MVC.ERP.integração.recurso.EnderecoCorreiosIntegracao;
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
