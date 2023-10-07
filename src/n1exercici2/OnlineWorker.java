package n1exercici2;


public class OnlineWorker extends Worker {

    private final int FEE;

    public OnlineWorker()
    {
        FEE = 30;

    }

    @Override
    public void calculateSalary(int hours)
    {
        int cost = costHour*hours;
        cost += FEE;

        System.out.println("The online worker's cost is " + cost + " euros");

    }

    @Deprecated
    public int getFEE()
    {
        return FEE;
    }
}
