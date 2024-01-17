package br.edu.ifpi.poo.models;

public class Subscribers implements TaskObserver {
    private String name;

    public Subscribers(String name) {
        this.name = name;
    }

    @Override
    public void update(String task) {
        System.out.println("Aluno " + name + " notificado: Nova tarefa - " + task);
    }
}