// Group words with same set of characters
// Given a list of words with lower cases. 
// Implement a function to find all Words that have the same unique character set .
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
class GroupWords
{
	static String getKey(String str)
	{

	}
	
	public static void groupWordsResult(String[] words, int len)
	{
		HashMap<String, ArrayList<Integer>> hash = new HashMap<>();
		for(int i=0; i<len; i++)
		{
			String key = getKey(words[i]);
		}
	}

	public static void main(String[] args) {
		String words[] = { "may", "student", "students", "dog",
                     "studentssess", "god", "cat", "act", "tab",
                     "bat", "flow", "wolf", "lambs", "amy", "yam",
                     "balms", "looped", "poodle"};
        int n = words.length;
        groupWordsResult(words, n);
	}
}