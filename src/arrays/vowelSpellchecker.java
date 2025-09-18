import java.util.*;
class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> lower = new HashMap<>();
        Map<String, String> masked = new HashMap<>();

        for(String w : wordlist){
            exact.add(w);
            lower.putIfAbsent(w.toLowerCase(Locale.ROOT), w);
            masked.putIfAbsent(mask(w), w);
        }
        String[] result = new String[queries.length];
        for(int i =0; i< queries.length; i++){
            String q = queries[i];
            if (exact.contains(q)) result[i] = q;
            else if (lower.containsKey(q.toLowerCase(Locale.ROOT))) result[i] = lower.get(q.toLowerCase(Locale.ROOT));
            else if (masked.containsKey(mask(q))) result[i] = masked.get(mask(q));
            else result[i] = "";
        }
        return result;
    }

    private static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    private static String mask(String w){
        char[] a = w.toLowerCase(Locale.ROOT).toCharArray();
        for(int i = 0; i<a.length; i++){
            if(isVowel(a[i])) a[i] = '*';
        }
        return new String(a);
    }
}