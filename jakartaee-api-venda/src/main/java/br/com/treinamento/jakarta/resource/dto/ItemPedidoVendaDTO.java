package br.com.treinamento.jakarta.resource.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ItemPedidoVendaDTO extends AbstractDTO {

    private Long id;

    private PedidoVendaDTO pedidoVenda;

    private ProdutoDTO produto;

    private BigDecimal quantidade;

    private BigDecimal valorUnitario;

    private LocalDateTime dataCadastro;

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public PedidoVendaDTO getPedidoVenda() {
        return pedidoVenda;
    }

    public void setPedidoVenda(PedidoVendaDTO pedidoVenda) {
        this.pedidoVenda = pedidoVenda;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public Long getId() {
        return id;
    }
}
