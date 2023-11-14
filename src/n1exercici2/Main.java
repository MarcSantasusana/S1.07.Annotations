package n1exercici2;


public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {

        OnlineWorker onlineWorker = new OnlineWorker("Peter", "Evans");

        int fee =  onlineWorker.getFEE();

        InPersonWorker inPersonWorker = new InPersonWorker("Michael", "Brown");

        int benzine = inPersonWorker.getBenzine();

        System.out.printf("Fee: %d \nBenzine: %d", fee, benzine);

    }
}