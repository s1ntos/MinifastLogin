package com.minifast.login.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    @Column(name = "first_name")
    private String name;

    @NotBlank(message = "Sobrenome não pode ser vazio")
    @Column(name = "lastname")
    private String lastname;

    @NotBlank(message = "Senha não pode ser vazia")
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
    @Column(name = "user_password")
    private String password;

    @NotBlank(message = "Celular não pode ser vazio")
    @Pattern(regexp = "\\(\\d{2}\\) \\d{5}-\\d{4}", message = "Formato de telefone inválido")
    @Column(name = "cellphone")
    private String cellphone;

    // Getters e Setters normais (sem anotações aqui)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}

