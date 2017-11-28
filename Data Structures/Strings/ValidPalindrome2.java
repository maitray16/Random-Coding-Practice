// Valid Palindrome II 

// Given a non-empty string s, you may delete at most one character. 
// Judge whether you can make it a palindrome.

// Example 1:
// Input: "aba"
// Output: True

// Example 2:
// Input: "abca"
// Output: True
// Explanation: You could delete the character 'c'.

class ValidPalindrome2
{
	public static boolean isPalindrome(String input, int start, int end)
	{
		for(int k=start; k<=start+(end-1); k++)
		{
			if(input.charAt(k) != input.charAt(end-k+1))
				return false;
		}

		return true;
	}

	public static boolean validPalindrome(String input)
	{
		for(int i=0; i<input.length()/2; i++)
		{
			if(input.charAt(i) != input.charAt(input.length() - 1 - i))
			{
				int j = input.length() - 1 - i;
				return (isPalindrome(input, i+1, j) || 
					isPalindrome(input, i, j-1));
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String input = "abca";
		System.out.println(validPalindrome(input));
	}
}