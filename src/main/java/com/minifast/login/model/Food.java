package com.minifast.login.model;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 17, nullable = false, unique = true)
    private String nome;

    @Column(length = 17, nullable = false)
    private String descricao;

    @Column(length = 17, nullable = false)
    private String preco; // compatível com VARCHAR(17) do banco

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getPreco() { return preco; }
    public void setPreco(String preco) { this.preco = preco; }
}

