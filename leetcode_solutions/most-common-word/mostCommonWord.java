import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
     String[] paragraphSplit = paragraph.split("\\W+");
     HashMap<String, Integer> mapOfWords = new HashMap<String, Integer>();
     HashSet<String> setOfBannedWords = new HashSet<String>();
        
        for (String c: banned) {
            setOfBannedWords.add(c.toLowerCase());
        }
        
        for (String c: paragraphSplit) {
            if(!setOfBannedWords.contains(c.toLowerCase())) {
                if(mapOfWords.containsKey(c.toLowerCase())) {
                    mapOfWords.put(c.toLowerCase(),mapOfWords.get(c.toLowerCase())+1);
                }
                else {
                mapOfWords.put(c.toLowerCase(), 1);
                }
            }
        }
        
        String valueOfString = "";
        int value = 0;
        for (Map.Entry<String, Integer> entry : mapOfWords.entrySet()) {
		    if(entry.getValue() > value) {
                valueOfString = entry.getKey();
                value = entry.getValue();
            }
    }
        return valueOfString;
        
}
}