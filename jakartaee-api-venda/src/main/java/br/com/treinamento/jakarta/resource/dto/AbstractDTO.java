package br.com.treinamento.jakarta.resource.dto;

public abstract class AbstractDTO {

    public abstract Long getId();

    public boolean equals(Object obj) {

        if(obj == null) return false;

        if(obj == this) return true;

        if(!(obj instanceof AbstractDTO)) return false;

        return getId().equals(((AbstractDTO) obj).getId());
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString(){
        return getClass().getName() + " [id=" + getId() + "]";
    }

}
