import br.edu.ifpi.poo.models.Subscribers;
import br.edu.ifpi.poo.models.Publisher;
import br.edu.ifpi.poo.models.TaskObserver;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando a sala virtual
        Publisher taskRoom = new Publisher();

        // Alunos se inscrevem na sala
        TaskObserver student1 = new Subscribers("Karielly");
        TaskObserver student2 = new Subscribers("Jean Carlos");

        taskRoom.subscribe(student1);
        taskRoom.subscribe(student2);
        System.out.println("============== Publicando uma nova tarefa (notificando os inscritos) ================");
        // Publicando uma nova tarefa (notificando os inscritos)
        taskRoom.publishTask("Demonstrar padrão de projeto.");
        System.out.println("");
        System.out.println("============== Publicando outra tarefa (apenas Karielly será notificada) ================");
        // Aluno Jean Carlos cancela inscrição na sala
        taskRoom.unsubscribe(student2);

        // Publicando outra tarefa (apenas Karielly será notificada)
        taskRoom.publishTask("Fazer relatório de POO.");
        System.out.println("");
    }

}
