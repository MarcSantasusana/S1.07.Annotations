package n1exercici1;

public class OnlineWorker extends Worker {

    private final int FEE;

    public OnlineWorker(String name, String surname)
    {
        super(name, surname);
        FEE = 30;


    }

    @Override
    public void calculateSalary(int hours)
    {
        int cost = costHour*hours;
        cost += FEE;

        System.out.println("The online worker's cost is " + cost + " euros");

    }
}
