import java.util.Timer;
import java.util.TimerTask;
public class ThrottleTimerImpl implements Throttler 
{
	private int throttlePeriod;

	public ThrottleTimerImpl(int throttlePeriod)
	{
		this.throttlePeriod = throttlePeriod;
	}

	public void start()
	{
		new Timer(true).schedule(new TimerTask(){
			@Override
			public void run(){
				CallsCount.reset();
			}
		}, 0, throttlePeriod);
	}
}