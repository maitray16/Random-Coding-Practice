// Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.

// Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
// Output:  True  //There is a subset (4, 5) with sum 9.

class SubsetSumProblem
{
	public static boolean isSubsetSum(int[] set, int len, int sum)
	{
		boolean subset[][] = new boolean[sum+1][len+1];
		for(int i=0; i<=len; i++)
			subset[0][i] = true;
		

	}

	public static void main(String[] args) {
		int[] set = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		int len = set.length;
		if(isSubsetSum(set, len, sum) == true)
			System.out.println("Found a subset");
		else
			System.out.println("No Subset");
	}
}