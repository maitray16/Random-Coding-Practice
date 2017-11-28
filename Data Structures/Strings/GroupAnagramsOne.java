// Given an array of strings, group anagrams together.

// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
// Return:

// [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
import java.util.*;
class GroupAnagramsOne
{
	public static List<List<String>> groupAnagrams(String[] group)
	{
		if(group.length == 0) return new ArrayList();
		Map<String, List> ans = new HashMap<String, List>();
		for(String str : group)
		{
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);

			if(!ans.containsKey(key)) ans.put(key, new ArrayList());
			ans.get(key).add(str);
		}
		return new ArrayList(ans.values());
	}
	
	public static void main(String[] args) {
		String[] group = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(group));
	}
}