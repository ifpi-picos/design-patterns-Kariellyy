package src.br.edu.ifpi.models;

import java.util.List;

public class EmployeeShutdownCommand implements Command {
    private List<Employee> employees;
    private Employee employee;

    public EmployeeShutdownCommand(List<Employee> employees, Employee employee) {
        this.employees = employees;
        this.employee = employee;
    }

    @Override
    public void execute() {
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println("Funcionário(a) desligado: " + employee.getName());
        } else {
            System.out.println("Funcionário(a) não encontrado: " + employee.getName());
        }
    }
}