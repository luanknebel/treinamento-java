package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.PedidoVenda;
import br.com.treinamento.jakarta.repository.ClienteRepository;
import br.com.treinamento.jakarta.repository.UsuarioRepository;
import br.com.treinamento.jakarta.resource.dto.PedidoVendaDTO;
import jakarta.inject.Inject;

import java.util.Objects;

public class PedidoVendaConverter implements IConverter<PedidoVenda, PedidoVendaDTO>{

    @Inject
    private ClienteConverter clienteConverter;

    @Inject
    private UsuarioConverter usuarioConverter;

    @Inject
    private ClienteRepository clienteRepository;

    @Inject
    private UsuarioRepository usuarioRepository;

    @Inject
    private ItemPedidoVendaConverter itemPedidoVendaConverter;

    @Override
    public PedidoVendaDTO convertTODTO(PedidoVenda entity) {
        PedidoVendaDTO dto = new PedidoVendaDTO();
        dto.setId(entity.getId());
        dto.setValorTotal(entity.getValorTotal());
        dto.setCliente(clienteConverter.convertTODTO(entity.getCliente()));
        dto.setUsuario(usuarioConverter.convertTODTO(entity.getUsuario()));
        dto.setItens(itemPedidoVendaConverter.convertTODTO(entity.getItens()));
        return dto;
    }

    @Override
    public PedidoVenda convertTOEntity(PedidoVendaDTO dto) {

        if(Objects.isNull(dto.getCliente())) {
            throw new RuntimeException("Cliente não pode ser nulo");
        }

        if(Objects.isNull(dto.getUsuario())) {
            throw new RuntimeException("Usuario não pode ser nulo");
        }

        Long idCliente = dto.getCliente().getId();
        Long idUsuario = dto.getUsuario().getId();

        PedidoVenda entity = new PedidoVenda();
        entity.setId(dto.getId());
        entity.setCliente(clienteRepository.findValidate(idCliente));
        entity.setUsuario(usuarioRepository.findValidate(idUsuario));
        return entity;
    }
}
