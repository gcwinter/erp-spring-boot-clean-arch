package br.com.gabriel.cleanarch.erp.controller;

import br.com.gabriel.cleanarch.erp.controller.recuso.ClienteDTO;
import br.com.gabriel.cleanarch.erp.controller.recuso.RequisicaoNovoContatoDTO;
import br.com.gabriel.cleanarch.erp.controller.recuso.RequisiçaoNovoclienteDTO;
import br.com.gabriel.cleanarch.erp.casodeuso.CadastrarNovoClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.CadastrarNovoContatoCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.NovoClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.PaginaNovoContatoCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.recurso.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClienteController {

    private final CadastrarNovoClienteCasoDeUso cadastrarNovoClienteCasoDeUso;
    private final NovoClienteCasoDeUso novoClienteCasoDeUso;
    private final CadastrarNovoContatoCasoDeUso cadastrarNovoContatoCasoDeUso;
    private final PaginaNovoContatoCasoDeUso paginaNovoContatoCasoDeUso;


    public ClienteController(CadastrarNovoClienteCasoDeUso cadastrarNovoClienteCasoDeUso,
                             NovoClienteCasoDeUso novoClienteCasoDeUso,
                             CadastrarNovoContatoCasoDeUso cadastrarNovoContatoCasoDeUso,
                             PaginaNovoContatoCasoDeUso paginaNovoContatoCasoDeUso) {
        this.cadastrarNovoClienteCasoDeUso = cadastrarNovoClienteCasoDeUso;
        this.novoClienteCasoDeUso = novoClienteCasoDeUso;
        this.cadastrarNovoContatoCasoDeUso = cadastrarNovoContatoCasoDeUso;
        this.paginaNovoContatoCasoDeUso = paginaNovoContatoCasoDeUso;
    }

    @GetMapping("/novoCliente")
    public String novoCliente() {
        novoClienteCasoDeUso.execute(null);
        return "novoCliente";
    }

    @PostMapping("/novoCliente")
    public String cadastrarNovoCliente(RequisiçaoNovoclienteDTO requisicaoDto) {

        cadastrarNovoClienteCasoDeUso.execute(requisicaoDto.criaCliente());
        return "novoCliente";
    }

    @ResponseBody
    @PostMapping("/clientes")
    public ClienteDTO cadastrarNovoClienteRest(@RequestBody RequisiçaoNovoclienteDTO requisicaoDto) {

        Cliente cliente = cadastrarNovoClienteCasoDeUso.execute(requisicaoDto.criaCliente());
        return new ClienteDTO(cliente);
    }

    @PostMapping("/novoContato")
    public String cadastrarNovoContato(RequisicaoNovoContatoDTO requisicaoDTO) {
        cadastrarNovoContatoCasoDeUso.execute(null);
        return "novoContato";
    }

    @GetMapping("/novoContato")
    public String paginaNovoContato() {
        paginaNovoContatoCasoDeUso.execute(null);
        return "novoContato";
    }


}
