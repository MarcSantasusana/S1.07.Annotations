package n1exercici2;

public class Worker {

    protected String name;
    protected String surname;
    protected int costHour;

    public Worker()
    {

        costHour = 15;

    }

    public void calculateSalary(int hours)
    {
        int cost = costHour*hours;

        System.out.println("The worker's cost is " + cost + " euros");

    }
}