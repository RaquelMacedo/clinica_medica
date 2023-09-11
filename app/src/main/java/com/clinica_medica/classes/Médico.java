package com.clinica_medica.classes;

public class Médico extends Pessoa {
     int crm;
    Especialidades especialidades;
    public Médico(int id, String nome, String cpf, String endereco, int dataNascimento, Contato contato, int crm,
    Especialidades especialidades) {
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
    public Especialidades getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }
    @Override
    public void criar () {
        //Cria Cadastro
    }
    @Override
    public void  ler () {
        //ler cadastro
    }
    @Override
    public void atualizar () {
        //atualiza cadastro
    }
    @Override
    public void deletar () {
        //deleta cadastro
    }
     public void enviarEmail(){
        //Receber instrucoes de seguranca do trabalho
    }


  

   
}
