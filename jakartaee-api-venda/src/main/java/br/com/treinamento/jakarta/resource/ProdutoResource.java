package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.IConverter;
import br.com.treinamento.jakarta.converter.ProdutoConverter;
import br.com.treinamento.jakarta.model.Produto;
import br.com.treinamento.jakarta.resource.dto.ProdutoDTO;
import br.com.treinamento.jakarta.service.IService;
import br.com.treinamento.jakarta.service.ProdutoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("produto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource extends AbstractResource<Produto, ProdutoDTO>{

    @Inject
    private ProdutoService produtoService;

    @Inject
    private ProdutoConverter produtoConverter;

    @Override
    public IService<Produto> getService() {
        return produtoService;
    }

    @Override
    public IConverter<Produto, ProdutoDTO> getConverter() {
        return produtoConverter;
    }
}
