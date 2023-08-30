package com.clinica_medica.classes;

public class Recepcionista extends Pessoa {
    int idRecepcionista;

    public Recepcionista(
        int id, String nome, String cpf, String endereco, int dataNascimento, Contato contato,
            int idRecepcionista) {
                
        super(id, nome, cpf, endereco, dataNascimento, contato);
        this.idRecepcionista = idRecepcionista;
    }
    
    
}
