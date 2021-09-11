package br.com.gabriel.cleanarch.erp.integração.impl;

import br.com.gabriel.cleanarch.erp.integração.ApiCorreios;
import br.com.gabriel.cleanarch.erp.integração.recurso.EnderecoCorreiosIntegracao;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@AllArgsConstructor
public class ApiCorreiosImpl implements ApiCorreios {
    private final ObjectMapper objectMapper;

    @Override
    public EnderecoCorreiosIntegracao buscarCep(String cep) {
        try {
            HttpClient client = HttpClient.newBuilder()
                    .build();
            HttpRequest request = null;
            request = HttpRequest.newBuilder()
                    .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/"))
                    .header("Content-Type", "application/json")
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
            return objectMapper.readValue(response.body(), EnderecoCorreiosIntegracao.class);
            //TODO retornar enderecoCorreioIntegracao dica do vini: usar objectmapper;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ApiCorreios apiCorreios = new ApiCorreiosImpl(new ObjectMapper());
        apiCorreios.buscarCep("09230600");
    }

}
