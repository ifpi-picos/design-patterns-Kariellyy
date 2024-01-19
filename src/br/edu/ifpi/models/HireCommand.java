package src.br.edu.ifpi.models;

import java.util.List;

public class HireCommand implements Command {

    private List<Employee> employees;
    private Employee employee;

    public HireCommand(List<Employee> employees, Employee employee) {
        this.employees = employees;
        this.employee = employee;
    }

    @Override
    public void execute() {
        if (employees.contains(employee)) {
            System.out.println("Funcionário já existe: " + employee.getName());
        } else {
            employees.add(employee);
            System.out.println("Funcionário contratado: " + employee.getName());
        }
    }
}
