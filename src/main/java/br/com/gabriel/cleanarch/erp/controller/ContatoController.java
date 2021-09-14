package br.com.gabriel.cleanarch.erp.controller;

import br.com.gabriel.cleanarch.erp.casodeuso.CadastrarContatoCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Contato;
import br.com.gabriel.cleanarch.erp.controller.recuso.ClienteDTO;
import br.com.gabriel.cleanarch.erp.controller.recuso.ContatoDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/clientes/{id}/contatos")
public class ContatoController {

    private final CadastrarContatoCasoDeUso cadastrarContatoCasoDeUso;

    @PostMapping
    public ContatoDTO cadastrarContato(@PathVariable long id, @RequestBody ContatoDTO contatoDTO) {
        Contato contato = cadastrarContatoCasoDeUso.execute(id, contatoDTO.paraContato());
        return new ContatoDTO(contato);

    }
}
