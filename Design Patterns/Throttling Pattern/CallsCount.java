import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

 // A class to keep track of the counter of different Tenants


public final class CallsCount
{
	private static Map<String, Integer> tenantCallsCount = new ConcurrentHashMap<>();

	public static void addTenant(String tenantName)
	{
		if(!tenantCallsCount.containsKey(tenantName))
		{
			tenantCallsCount.put(tenantName, 0);
		}
	}

	public static void incrementCount(String tenantName)
	{
		tenantCallsCount.put(tenantName, tenantCallsCount.get(tenantName)+1);
	}

	public static int getCount(String tenantName)
	{
		return tenantCallsCount.get(tenantName);
	}

	public static void reset()
	{
		for(Entry<String, Integer> e : tenantCallsCount.entrySet())
		{
			tenantCallsCount.put(e.getKey(), 0);
		}
	}

}