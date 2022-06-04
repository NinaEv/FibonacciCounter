package jadv.task_5_1;

public class Main {

    public static void main(String[] args) {
        new Thread(new Server()::calculate).start();
        new Thread(new Client()::enter).start();
    }
}
