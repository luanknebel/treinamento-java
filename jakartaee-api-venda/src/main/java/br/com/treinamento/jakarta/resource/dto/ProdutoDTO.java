package br.com.treinamento.jakarta.resource.dto;

public class ProdutoDTO extends AbstractDTO {

    private Long id;
    private String descricao;

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Long getId() {
        return id;
    }
}
