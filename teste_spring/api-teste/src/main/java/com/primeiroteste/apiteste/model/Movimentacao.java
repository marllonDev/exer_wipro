package com.primeiroteste.apiteste.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Movimentacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cartao;
    private Integer valor;
    private Date data = new Date(System.currentTimeMillis());

    public Movimentacao(String cartao, Integer valor) {
        super();
        this.cartao = cartao;
        this.valor = valor;
        this.data = data;
    }

    public Movimentacao() {
     super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movimentacao that = (Movimentacao) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
