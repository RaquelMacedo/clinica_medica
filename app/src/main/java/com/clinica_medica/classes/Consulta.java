package com.clinica_medica.classes;

public class Consulta {
    int idExame;
    String medico;
    Paciente paciente;
    int numeroDaConsulta;
    String dataDaConsulta;
    String observacoes;
    String hora;
    String status;
    public Consulta(int idExame, String medico, Paciente paciente, int numeroDaConsulta, String dataDaConsulta,
            String observacoes, String hora, String status) {
        this.idExame = idExame;
        this.medico = medico;
        this.paciente = paciente;
        this.numeroDaConsulta = numeroDaConsulta;
        this.dataDaConsulta = dataDaConsulta;
        this.observacoes = observacoes;
        this.hora = hora;
        this.status = status;
    }
    public int getIdExame() {
        return idExame;
    }
    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public int getNumeroDaConsulta() {
        return numeroDaConsulta;
    }
    public void setNumeroDaConsulta(int numeroDaConsulta) {
        this.numeroDaConsulta = numeroDaConsulta;
    }
    public String getDataDaConsulta() {
        return dataDaConsulta;
    }
    public void setDataDaConsulta(String dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
