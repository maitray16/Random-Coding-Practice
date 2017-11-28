import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

class MagicDictionary1
{
    static Map<Integer, ArrayList<String>> buckets = new HashMap<>();

    public static void buildDict(String[] wordList){
        for(String word : wordList){
            buckets.computeIfAbsent(word.length(), x -> new ArrayList<>()).add(word);
        }
   
    }

    public static boolean search(String target){
        if(!buckets.containsKey(target.length())) return false;
        for(String candidate : buckets.get(target.length())){
            int mismatch = 0;
            for(int i=0; i<target.length(); ++i)
                {
                    if(target.charAt(i) != candidate.charAt(i))
                        {
                            if(++mismatch > 1) break;
                        }
                }
                if (mismatch == 1) return true;

        }
        return false;


    }
    
    public static void main(String[] args)
    {
        String[] wordList = {"hello", "leetcode", "abc"};
        buildDict(wordList);
        buckets.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println(search("hello"));


        
    }
}