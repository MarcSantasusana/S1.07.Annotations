package n1exercici2;


public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {

        OnlineWorker onlineWorker = new OnlineWorker();

        int fee =  onlineWorker.getFEE();

        InPersonWorker inPersonWorker = new InPersonWorker();

        int benzine = inPersonWorker.getBenzine();

        System.out.printf("Fee: %d \nBenzine: %d", fee, benzine);

    }
}