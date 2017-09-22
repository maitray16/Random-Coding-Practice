
import java.util.concurrent.ThreadLocalRandom;

public class B2BService
{
	public B2BService(Throttler timer)
	{
		timer.start();
	}

	public int dummyCustomerApi(Tenant tenant)
	{
		String tenantName = tenant.getName();
		int count = CallsCount.getCount(tenantName);
		if(count >= tenant.getAllowedCallsPerSecond())
		{
			System.out.println("API limit reached");
			return -1;
		}
		CallsCount.incrementCount(tenantName);
		return getRandomCustomerId();
	}

	private int getRandomCustomerId()
	{
		return ThreadLocalRandom.current().nextint(1,1000);
	}

}