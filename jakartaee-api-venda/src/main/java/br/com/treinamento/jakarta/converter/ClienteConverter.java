package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.resource.dto.ClienteDTO;

public class ClienteConverter implements IConverter<Cliente, ClienteDTO>{


    @Override
    public ClienteDTO convertTODTO(Cliente entity) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setDataCadastro(entity.getDataCadastro());
        return dto;
    }

    @Override
    public Cliente convertTOEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setNome(dto.getNome());
        cliente.setDataCadastro(dto.getDataCadastro());
        return cliente;
    }
}
