package br.com.treinamento.jakarta.resource.dto;

import java.time.LocalDateTime;

public class ClienteDTO extends AbstractDTO{

    private Long id;

    private String nome;

    private LocalDateTime dataCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

