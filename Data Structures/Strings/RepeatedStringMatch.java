// Repeated String Match 
// Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
// For example, with A = "abcd" and B = "cdabcdab".
// Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
import java.lang.*;
class RepeatedStringMatch
{
	public static int repeatedStringMatch(String A, String B)
	{
		int q=1;
		StringBuilder s = new StringBuilder(A);
		System.out.println("Before loop " + s);
		for (; s.length() < B.length(); q++) {
			s.append(A);
		}
		System.out.println("After loop " + s);
		if(s.indexOf(B) >= 0) return q;
		if(s.append(A).indexOf(B) >= 0) return q+1;

		return -1;
	}
	public static void main(String[] args) {
		String A = "abcd";
		String B = "cdabcdab";
		System.out.println(repeatedStringMatch(A,B));
	}
}