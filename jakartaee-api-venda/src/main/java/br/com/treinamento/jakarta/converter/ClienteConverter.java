package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.resource.dto.ClienteDTO;

public class ClienteConverter {

    public ClienteDTO convertTODTO(Cliente cliente){
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setDataCadastro(cliente.getDataCadastro());

        return clienteDTO;
    }

    public Cliente converTOEntity(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNome(clienteDTO.getNome());
        cliente.setDataCadastro(clienteDTO.getDataCadastro());

        return cliente;
    }
}
