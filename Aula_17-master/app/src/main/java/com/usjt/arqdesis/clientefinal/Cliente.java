package com.usjt.arqdesis.clientefinal;

import java.io.Serializable;

/**
 * Created by Victor Andrade on 26/10/2016.
 */

public class Cliente implements Serializable {

    private int id;
    private String nome, fone, email;

    public Cliente(int id, String email, String fone, String nome) {
        this.id = id;
        this.email = email;
        this.fone = fone;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
