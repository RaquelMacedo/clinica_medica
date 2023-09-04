package com.clinica_medica.classes;

public class Exame {
    int id;
    String resultado;
    String nomeDoExame;
    public Exame(int id, String resultado, String nomeDoExame) {
        this.id = id;
        this.resultado = resultado;
        this.nomeDoExame = nomeDoExame;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public String getNomeDoExame() {
        return nomeDoExame;
    }
    public void setNomeDoExame(String nomeDoExame) {
        this.nomeDoExame = nomeDoExame;
    }
    
    
}
