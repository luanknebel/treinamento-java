package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.IConverter;
import br.com.treinamento.jakarta.converter.PedidoVendaConverter;
import br.com.treinamento.jakarta.model.PedidoVenda;
import br.com.treinamento.jakarta.resource.dto.PedidoVendaDTO;
import br.com.treinamento.jakarta.service.IService;
import br.com.treinamento.jakarta.service.PedidoVendaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("pedido-venda")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PedidoVendaResource extends AbstractResource<PedidoVenda, PedidoVendaDTO>{

    @Inject
    private PedidoVendaService pedidoVendaService;

    @Inject
    private PedidoVendaConverter pedidoVendaConverter;

    @Override
    public IService<PedidoVenda> getService() {
        return pedidoVendaService;
    }

    @Override
    public IConverter<PedidoVenda, PedidoVendaDTO> getConverter() {
        return pedidoVendaConverter;
    }
}
