package com.clinica_medica.classes;

public class  Paciente extends Pessoa {
    int idPaciente;


    
    public Paciente(int id, String nome, String cpf, String endereco, int dataNascimento, Contato contato,
            int idPaciente) {
        super(id, nome, cpf, endereco, dataNascimento, contato);
        this.idPaciente = idPaciente;
    }
    
    
    public int getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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


