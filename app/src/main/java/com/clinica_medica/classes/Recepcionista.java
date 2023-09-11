package com.clinica_medica.classes;

public class Recepcionista extends Pessoa {
    int idRecepcionista;

    public Recepcionista(
        int id, String nome, String cpf, String endereco, int dataNascimento, Contato contato,
            int idRecepcionista) {
                
        super(id, nome, cpf, endereco, dataNascimento, contato);
        this.idRecepcionista = idRecepcionista;
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
