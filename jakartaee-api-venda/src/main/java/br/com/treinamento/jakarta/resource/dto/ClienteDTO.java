package br.com.treinamento.jakarta.resource.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ClienteDTO extends AbstractDTO{

    private Long id;

    private String nome;

    private LocalDateTime dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

