package com.clinica_medica.classes;

public class Especialidades {

    int id;
    String nomeDaEspecialidade;
    public Especialidades(int id, String nomeDaEspecialidade) {
        this.id = id;
        this.nomeDaEspecialidade = nomeDaEspecialidade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeDaEspecialidade() {
        return nomeDaEspecialidade;
    }
    public void setNomeDaEspecialidade(String nomeDaEspecialidade) {
        this.nomeDaEspecialidade = nomeDaEspecialidade;
    }
    
}
