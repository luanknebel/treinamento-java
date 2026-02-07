package br.com.treinamento.jakarta.model;

public abstract class AbstractModel {

    public abstract Long getId();

    public boolean equals(Object obj) {

        if(obj == null) return false;

        if(obj == this) return true;

        if(!(obj instanceof AbstractModel)) return false;

        return getId().equals(((AbstractModel) obj).getId());
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString(){
        return getClass().getName() + " [id=" + getId() + "]";
    }

}
