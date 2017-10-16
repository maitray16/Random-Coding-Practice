// Maximum Product Subarray
// Given an array that contains both positive and negative integers, 
// find the product of the maximum product subarray. 
// Expected Time complexity is O(n) and only O(1) extra space can be used.
// Input: arr[] = {6, -3, -10, 0, 2}
// Output:   180  // The subarray is {6, -3, -10}

class MaxProductSumArray
{
	public static int maxSubArray(int[] arr, int len)
	{
		int max_ending_here = arr[0];
		int min_ending_here = arr[0];
		int max_so_far = arr[0];

		for(int i=0; i<n; i++)
		{
				
		}
	}
	public static void main(String[] args) {
		int[] arr = {6, -3, -10, 0, 2};
		int len = arr.length;
		System.out.println("Maximum Product Subarray " + maxSubArray(arr, len));
		
	}
}