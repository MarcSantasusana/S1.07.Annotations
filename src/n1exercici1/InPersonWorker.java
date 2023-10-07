package n1exercici1;

public class InPersonWorker extends Worker {

    private static int benzine;

    public InPersonWorker()
    {
        benzine = 100;

    }

    @Override
    public void calculateSalary(int hours)
    {
        int cost = costHour*hours;
        cost += benzine;

        System.out.println("The in person worker's cost is " + cost + " euros");

    }
}
