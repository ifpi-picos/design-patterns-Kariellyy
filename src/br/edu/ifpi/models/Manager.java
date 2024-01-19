package src.br.edu.ifpi.models;

public class Manager {
    // O Manager é o gerente, quem vai invocar os comandos
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
