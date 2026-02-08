package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.Produto;
import br.com.treinamento.jakarta.resource.dto.ProdutoDTO;

public class ProdutoConverter implements IConverter<Produto, ProdutoDTO>{

    @Override
    public ProdutoDTO convertTODTO(Produto entity) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(entity.getId());
        dto.setDescricao(entity.getDescricao());
        return dto;
    }

    @Override
    public Produto convertTOEntity(ProdutoDTO dto) {
        Produto entity = new Produto();
        entity.setId(dto.getId());
        entity.setDescricao(dto.getDescricao());
        return entity;
    }
}
