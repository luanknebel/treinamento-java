package br.com.treinamento.jakarta.resource.dto;

import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.model.Usuario;

import java.math.BigDecimal;
import java.util.Set;

public class PedidoVendaDTO extends AbstractDTO {

    private Long id;

    private Cliente cliente;

    private Usuario usuario;

    private BigDecimal valorTotal;

    private Set<ItemPedidoVendaDTO> itens;

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Set<ItemPedidoVendaDTO> getItens() {
        return itens;
    }

    public void setItens(Set<ItemPedidoVendaDTO> itens) {
        this.itens = itens;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public Long getId() {
        return id;
    }
}
