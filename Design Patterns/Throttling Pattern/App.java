// Throttling pattern is a design pattern to throttle or limit the use of resources or 
// even a complete service by users or a particular tenant.

// In this example we have ({App}) as the initiating point of the service.
// This is a time based throttling, i.e. only a certain number of calls are allowed per second.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;

public class App
{
	public static void main(String[] args)
	{
		Tenant tenant1 = new Tenant("tenant1", 4);
		Tenant tenant2 = new Tenant("tenant2", 5);

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(() -> makeServiceCalls(tenant1));
		executorService.execute(() -> makeServiceCalls(tenant2));

		executorService.shutdown();
		try
		{
			executorService.awaitTermination(10, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

	private static void makeServiceCalls(Tenant tenant)
	{
		Throttler timer = new ThrottleTimerImpl(10);
		B2BService service = new B2BService(timer);
		for(int i=0; i<20; i++)
		{
			service.dummyCustomerApi(tenant);
			try
			{
				Thread.sleep(1);
			}catch(Exception e)
			{
				System.out.println("error");
			}
		}
	}
}