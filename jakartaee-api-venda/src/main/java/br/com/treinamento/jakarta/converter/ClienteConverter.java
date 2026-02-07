package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.resource.dto.ClienteDTO;

public class ClienteConverter {

    public ClienteDTO converterTODTO(Cliente cliente){
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setDataNascimento(cliente.getDataNascimento());

        return clienteDTO;
    }

    public Cliente converterTOEntity(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNome(clienteDTO.getNome());
        cliente.setDataNascimento(clienteDTO.getDataNascimento());

        return cliente;
    }
}
