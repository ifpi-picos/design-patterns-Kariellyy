package src.br.edu.ifpi.models;

public class Employee {
    private int id;
    private String name;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}