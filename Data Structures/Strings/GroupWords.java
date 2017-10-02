// Group words with same set of characters
// Given a list of words with lower cases. 
// Implement a function to find all Words that have the same unique character set .
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
class GroupWords
{
	static final int MAX_CHARS = 26;

	static String getKey(String str)
	{
		String key="";
		boolean[] visited = new boolean[MAX_CHARS];
		Arrays.fill(visited, false);

		for(int i=0; i<str.length(); i++)
			visited[str.charAt(i) - 'a'] = true;

		for(int j=0; j<MAX_CHARS; j++)
		{
			if(visited[j])
				key = key + (char)('a' + j);
				System.out.println(key);
		}

		return key;

	}

	public static void groupWordsResult(String[] words, int len)
	{
		HashMap<String, ArrayList<Integer>> hash = new HashMap<>();
		for(int i=0; i<len; i++)
		{
			String key = getKey(words[i]);
			if(hash.containsKey(key))
			{
				ArrayList<Integer> get_al = hash.get(key);
                get_al.add(i);
                hash.put(key, get_al);
			}
			else
			{
				ArrayList<Integer> new_al = new ArrayList<>();
                new_al.add(i);
                hash.put(key, new_al);
			}
		}

		for (Entry<String, ArrayList<Integer>> it : hash.entrySet())
        {
            ArrayList<Integer> get =it.getValue();
            for (Integer v:get)
                System.out.print( words[v] + ", ");
            System.out.println();
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