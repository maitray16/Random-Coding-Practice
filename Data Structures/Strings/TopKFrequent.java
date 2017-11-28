import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class TopKFrequent
{
    public static List<String> frequentList(String[] words, int k)
    {
        Map<String, Integer> count = new HashMap<>();
        for(String word : words)
            count.put(word, count.getOrDefault(word, 0) + 1);
        
        List<String> candidates = new ArrayList<>(count.keySet());
        
        Collections.sort(candidates, (w1, w2) -> count.get(w1) != count.get(w2) ? count.get(w2) - count.get(w1) : w1.compareTo(w2));
        for(String item : candidates)
            System.out.println(item);
        
        return candidates.subList(0, k);

    }

    public static void main(String[] args)
    {
        int k = 2;
        String[] wordList = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(frequentList(wordList, k));
    }
}