package n1exercici1;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("John", "Smith");

        worker.calculateSalary(100);

        OnlineWorker onlineWorker = new OnlineWorker("Peter", "Evans");

        onlineWorker.calculateSalary(100);

        InPersonWorker inPersonWorker = new InPersonWorker("Michael", "Brown");

        inPersonWorker.calculateSalary(100);
    }
}