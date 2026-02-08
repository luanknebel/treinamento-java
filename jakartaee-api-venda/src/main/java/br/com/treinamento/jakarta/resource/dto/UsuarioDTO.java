package br.com.treinamento.jakarta.resource.dto;

public class UsuarioDTO extends AbstractDTO{

    private Long id;
    private String login;
    private String senha;
    private Boolean ativo;

    public Boolean getAtivo(){
        return ativo;
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

}
