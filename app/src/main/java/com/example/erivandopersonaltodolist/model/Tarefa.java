package com.example.erivandopersonaltodolist.model;

import java.io.Serializable;

public class Tarefa implements Serializable {

    private Long Id;
    private String nomeTarefa;

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }
}
