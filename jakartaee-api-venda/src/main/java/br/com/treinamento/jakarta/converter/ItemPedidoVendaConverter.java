package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.ItemPedidoVenda;
import br.com.treinamento.jakarta.repository.PedidoVendaRepository;
import br.com.treinamento.jakarta.repository.ProdutoRepository;
import br.com.treinamento.jakarta.resource.dto.ItemPedidoVendaDTO;
import br.com.treinamento.jakarta.resource.dto.ProdutoDTO;
import jakarta.inject.Inject;

import java.time.LocalDateTime;
import java.util.Objects;

public class ItemPedidoVendaConverter implements IConverter<ItemPedidoVenda, ItemPedidoVendaDTO>{

    @Inject
    private ProdutoConverter produtoConverter;

    @Inject
    private ProdutoRepository produtoRepository;

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

        ProdutoDTO produto = dto.getProduto();
        if(Objects.isNull(produto)) {
            throw new RuntimeException("Produto não pode ser nulo");
        }

        ItemPedidoVenda entity = new ItemPedidoVenda();
        entity.setId(dto.getId());
        entity.setQuantidade(dto.getQuantidade());
        entity.setDataCadastro(LocalDateTime.now());
        entity.setValorUnitario(dto.getValorUnitario());
        entity.setProduto(produtoRepository.findValidate(produto.getId()));
        entity.setPedidoVenda(pedidoVendaRepository.findValidate(dto.getIdPedido()));
        return entity;
    }

}