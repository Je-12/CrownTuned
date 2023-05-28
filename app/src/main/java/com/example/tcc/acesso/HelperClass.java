package com.example.tcc.acesso;

public class HelperClass {
    String name, email, sugestao;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSugestao() {
        return sugestao;
    }
    public void setPassword(String sugestao) {
        this.sugestao = sugestao;
    }
    public HelperClass(String name, String email, String sugestao) {
        this.name = name;
        this.email = email;
        this.sugestao = sugestao;
    }
    public HelperClass() {
    }
}
