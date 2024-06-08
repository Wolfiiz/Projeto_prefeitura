package models;

import java.time.LocalDate;

public class Servico {
    private final int id;
    private final String tipo;
    private final String descricao;
    private final String status;
    private final LocalDate dataAgendamento;

    public Servico(int id, String tipo, String descricao, String status, LocalDate dataAgendamento) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.status = status;
        this.dataAgendamento = dataAgendamento;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }
}
