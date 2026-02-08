package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.ItemPedidoVenda;
import br.com.treinamento.jakarta.repository.PedidoVendaRepository;
import br.com.treinamento.jakarta.resource.dto.ItemPedidoVendaDTO;
import br.com.treinamento.jakarta.resource.dto.ProdutoDTO;
import jakarta.inject.Inject;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ItemPedidoVendaConverter implements IConverter<ItemPedidoVenda, ItemPedidoVendaDTO>{

    @Inject
    private ProdutoConverter produtoConverter;

    @Inject
    private PedidoVendaRepository pedidoVendaRepository;

    @Override
    public ItemPedidoVendaDTO convertTODTO(ItemPedidoVenda entity) {
        ItemPedidoVendaDTO dto = new ItemPedidoVendaDTO();
        dto.setId(entity.getId());
        dto.setIdPedido(entity.getPedidoVenda().getId());
        dto.setProduto(produtoConverter.convertTODTO(entity.getProduto()));
        dto.setQuantidade(entity.getQuantidade());
        dto.setValorUnitario(entity.getValorUnitario());
        dto.setDataCadastro(entity.getDataCadastro());
        return dto;
    }

    @Override
    public ItemPedidoVenda convertTOEntity(ItemPedidoVendaDTO dto) {
        ItemPedidoVenda entity = new ItemPedidoVenda();
        entity.setId(dto.getId());
        entity.setPedidoVenda(pedidoVendaRepository.find(dto.getIdPedido()));
        entity.setProduto(produtoConverter.convertTOEntity(dto.getProduto()));
        entity.setQuantidade(dto.getQuantidade());
        entity.setValorUnitario(dto.getValorUnitario());
        entity.setDataCadastro(LocalDateTime.now());
        return entity;
    }

}