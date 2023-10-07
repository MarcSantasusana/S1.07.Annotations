package n1exercici1;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker();

        worker.calculateSalary(100);

        OnlineWorker onlineWorker = new OnlineWorker();

        onlineWorker.calculateSalary(100);

        InPersonWorker inPersonWorker = new InPersonWorker();

        inPersonWorker.calculateSalary(100);
    }
}