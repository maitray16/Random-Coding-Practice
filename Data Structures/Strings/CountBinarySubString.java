// Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

// Substrings that occur multiple times are counted the number of times they occur.

// Example 1:
// Input: "00110011"
// Output: 6
// Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

// Notice that some of these substrings repeat and are counted the number of times they occur.

// Also, "00110011" is not a valid substring because all the 0's (and 1's) 

import java.lang.*;
class CountBinarySubString
{
	public static int countSubstring(String inp)
	{
		int[] group = new int[inp.length()];
		int t=0;
		group[0] = 1;

		for(int i=1; i<inp.length(); i++)
		{
			if(inp.charAt(i-1) != inp.charAt(i))
				group[++t] = 1;
			else
				group[t]++;
		}

		int ans = 0;

		for(int i=1; i<=t; i++)
		{
			ans += Math.min(group[i-1], group[i]);
		}

		return ans;
	}

	public static void main(String[] args) {
		String input = "00110011";
		System.out.println(countSubstring(input));
	}
}