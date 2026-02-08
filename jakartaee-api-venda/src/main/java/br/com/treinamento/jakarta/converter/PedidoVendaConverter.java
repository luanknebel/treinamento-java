package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.PedidoVenda;
import br.com.treinamento.jakarta.resource.dto.PedidoVendaDTO;
import jakarta.inject.Inject;

public class PedidoVendaConverter implements IConverter<PedidoVenda, PedidoVendaDTO>{

    @Inject
    private ClienteConverter clienteConverter;

    @Inject
    private UsuarioConverter usuarioConverter;

    @Inject
    private ItemPedidoVendaConverter itemPedidoVendaConverter;

    @Override
    public PedidoVendaDTO convertTODTO(PedidoVenda entity) {
        PedidoVendaDTO dto = new PedidoVendaDTO();
        dto.setId(entity.getId());
        dto.setCliente(clienteConverter.convertTODTO(entity.getCliente()));
        dto.setUsuario(usuarioConverter.convertTODTO(entity.getUsuario()));
        dto.setValorTotal(entity.getValorTotal());
        dto.setItens(itemPedidoVendaConverter.convertTODTO(entity.getItens()));

        return dto;
    }

    @Override
    public PedidoVenda convertTOEntity(PedidoVendaDTO dto) {
        PedidoVenda entity = new PedidoVenda();
        entity.setId(dto.getId());
        entity.setCliente(clienteConverter.convertTOEntity(dto.getCliente()));
        entity.setUsuario(usuarioConverter.convertTOEntity(dto.getUsuario()));
        entity.setValorTotal(dto.getValorTotal());
        entity.setItens(itemPedidoVendaConverter.convertTOEntity(dto.getItens()));

        return entity;
    }
}
