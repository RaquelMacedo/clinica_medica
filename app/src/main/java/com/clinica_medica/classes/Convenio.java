package com.clinica_medica.classes;

public class Convenio {

    int id;
    String nomeDoPlano;
    String cobertura;
    public Convenio(int id, String nomeDoPlano, String cobertura) {
        this.id = id;
        this.nomeDoPlano = nomeDoPlano;
        this.cobertura = cobertura;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeDoPlano() {
        return nomeDoPlano;
    }
    public void setNomeDoPlano(String nomeDoPlano) {
        this.nomeDoPlano = nomeDoPlano;
    }
    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    
}
