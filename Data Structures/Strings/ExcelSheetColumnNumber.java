// Given a column title as appear in an Excel sheet, return its corresponding column number. 
// For example:

//     A -> 1
//     B -> 2
//     C -> 3
//     ...
//     Z -> 26
//     AA -> 27
//     AB -> 28 
//     ...
//     AAA -> 703

import java.lang.Math;
class ExcelSheetColumnNumber
{
	public static int titleToNumber(String input)
	{
		if(input == null || input.length() == 0)
			throw new IllegalArgumentException("Invalid Input");
		int result = 0;
		int i = input.length() - 1;
		int t = 0;
		while(i >= 0)
		{
			char curr = input.charAt(i);
			System.out.println((int)Math.pow(26,t) * (curr-'A'+1));
			result = result + (int)Math.pow(26,t) * (curr-'A'+1);
			t++;
			i--;
		}
		return result;

	}

	public static void main(String[] args) {
		String input = "AA";
		System.out.println(titleToNumber(input));
	}
}