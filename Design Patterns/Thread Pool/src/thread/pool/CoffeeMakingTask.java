package thread.pool;
public class CoffeeMakingTask extends Task
{
    private static final int TIME_PER_COFFEE = 100;

    public CoffeeMakingTask(int numCoffee)
    {
        super(TIME_PER_COFFEE * numCoffee);
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}