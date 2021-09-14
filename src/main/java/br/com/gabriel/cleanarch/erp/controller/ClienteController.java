package br.com.gabriel.cleanarch.erp.controller;

import br.com.gabriel.cleanarch.erp.casodeuso.AtualizarClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.BuscarClientePorFiltroCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.CadastrarClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.ExcluirClienteCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;
import br.com.gabriel.cleanarch.erp.controller.recuso.ClienteDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    private final CadastrarClienteCasoDeUso cadastrarClienteCasoDeUso;
    private final AtualizarClienteCasoDeUso atualizarClienteCasoDeUso;
    private final BuscarClientePorFiltroCasoDeUso buscarClientePorFiltroCasoDeUso;
    private final ExcluirClienteCasoDeUso excluirClienteCasoDeUso;

    @PostMapping
    public ClienteDTO cadastrarCliente(@RequestBody ClienteDTO clienteDTO) {
        final Cliente cliente = cadastrarClienteCasoDeUso.execute(clienteDTO.paraCliente());
        return new ClienteDTO(cliente);
    }

    @PutMapping("/{id}")
    public ClienteDTO atualizarCliente(@PathVariable long id, @RequestBody ClienteDTO clienteDTO) {
        if (clienteDTO.getId() != id) {
            throw new RuntimeException("ID do corpo diferente da URI");
        }
        final Cliente execute = atualizarClienteCasoDeUso.execute(clienteDTO.paraCliente());
        return new ClienteDTO(execute);
    }

    @GetMapping
    public ClienteDTO buscarCliente(ClienteDTO clienteDTO) {
        final Cliente execute = buscarClientePorFiltroCasoDeUso.execute(clienteDTO.paraCliente());
        return new ClienteDTO(execute);
    }

    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable long id) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(id);
        excluirClienteCasoDeUso.execute(clienteDTO.paraCliente());
    }

}
