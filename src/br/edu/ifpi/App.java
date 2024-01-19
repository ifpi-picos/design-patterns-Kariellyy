package src.br.edu.ifpi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.br.edu.ifpi.models.Command;
import src.br.edu.ifpi.models.Employee;
import src.br.edu.ifpi.models.EmployeeShutdownCommand;
import src.br.edu.ifpi.models.HireCommand;
import src.br.edu.ifpi.models.Manager;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Gerenciar Funcionários");
            System.out.println("1 - Lista de Funcionários");
            System.out.println("2 - Contratar Funcionário");
            System.out.println("3 - Desligar Funcionário");
            System.out.println("0 - Sair");

            System.out.println("Digite a opção desejada: ");
            int option = Integer.parseInt(System.console().readLine());
            clearScreen();

            switch (option) {
                case 1:
                    // mostrar a lista de funcionários contratados
                    if (employees.size() == 0) {
                        System.out.println("Nenhum funcionário contratado");
                    } else {
                        System.out.println("Lista de Funcionários:");
                        for (Employee employee : employees) {
                            System.out.println("ID: " + employee.getId());
                            System.out.println("Funcionário(a): " + employee.getName());
                        }
                    }
                    System.out.println("Pressione enter para continuar...");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 2:
                    // contratar um funcionário
                    System.out.println("Digite o nome do funcionário(a): ");
                    String name = System.console().readLine();
                    Employee newEmployee = new Employee(name);
                    Command hireCommand = new HireCommand(employees, newEmployee);
                    manager.setCommand(hireCommand);
                    manager.executeCommand();
                    System.out.println("Pressione enter para continuar...");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 3:
                    System.out.println("Digite o nome do funcionário(a): ");
                    String name3 = System.console().readLine();
                    Employee removEmployee = null;
                    for (Employee employee : employees) {
                        if (employee.getName().equals(name3)) {
                            removEmployee = employee;
                        }
                    }
                    Command employeeShutdownCommand = new EmployeeShutdownCommand(employees, removEmployee);
                    manager.setCommand(employeeShutdownCommand);
                    manager.executeCommand();
                    System.out.println("Pressione enter para continuar...");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}