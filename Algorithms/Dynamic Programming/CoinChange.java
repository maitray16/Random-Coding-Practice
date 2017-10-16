import java.util.Arrays;
class CoinChange
{
	public static long countWays(int arr[], int len, int target)
	{
		long[] table = new long[target+1];
		Arrays.fill(table, 0);
		table[0] = 1;

		for(int i=0; i<len; i++)
		{
			for(int j=arr[i]; j<=target; j++)
				table[j] += table[j-arr[i]];
		}

		return table[target];
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays(arr, m, n));
	}
}