package com.clinica_medica.classes;

public class Médico extends Pessoa {
     int crm;
     String especialidades;
    public Médico(int id, String nome, String cpf, String endereco, int dataNascimento, Contato contato, int crm,
            String especialidades) {
        super(id, nome, cpf, endereco, dataNascimento, contato);
        this.crm = crm;
        this.especialidades = especialidades;
    }
    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }
    public String getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }


  

   
}
