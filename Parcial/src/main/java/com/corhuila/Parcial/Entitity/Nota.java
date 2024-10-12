package com.corhuila.Parcial.Entitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "Nota")
public class Nota extends ABaseEntity{
    @Column(name = "nota", length = 20)
    private String nota;

    @Column(name = "corte", length = 20)
    private String corte;

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }
}
