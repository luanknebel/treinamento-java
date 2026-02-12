package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.IConverter;
import br.com.treinamento.jakarta.converter.ItemPedidoVendaConverter;
import br.com.treinamento.jakarta.model.ItemPedidoVenda;
import br.com.treinamento.jakarta.resource.dto.ItemPedidoVendaDTO;
import br.com.treinamento.jakarta.service.IService;
import br.com.treinamento.jakarta.service.ItemPedidoVendaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("item-pedido-venda")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemPedidoVendaResource extends AbstractResource<ItemPedidoVenda, ItemPedidoVendaDTO>{

    @Inject
    private ItemPedidoVendaService itemPedidoVendaService;

    @Inject
    private ItemPedidoVendaConverter itemPedidoVendaConverter;

    @Override
    public IService<ItemPedidoVenda> getService() {
        return itemPedidoVendaService;
    }

    @Override
    public IConverter<ItemPedidoVenda, ItemPedidoVendaDTO> getConverter() {
        return itemPedidoVendaConverter;
    }
}

