package br.edu.ifpi.poo.models;

public class Student implements TaskObserver {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String task) {
        System.out.println("Aluno " + name + " notificado: Nova tarefa - " + task);
    }
}