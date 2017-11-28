package thread.pool;

public class PotatoPeelingTask extends Task
{
    private static final int TIME_PER_POTATO = 200;
    public PotatoPeelingTask(int num)
    {
        super(num * TIME_PER_POTATO);
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}