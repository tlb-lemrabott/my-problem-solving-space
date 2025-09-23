// https://leetcode.com/problems/reorganize-string/description/

import java.util.*;

public class ReorganizeString {
    public String reorganizeString(String s) {
        int[] countFreq = new int[26];
        for(char c : s.toCharArray()){
            countFreq[c - 'a']++;
        }
        
        // Check if reorganization is possible
        int maxFreq = 0;
        for(int freq : countFreq){
            maxFreq = Math.max(maxFreq, freq);
        }
        
        // If the most frequent character appears more than (n+1)/2 times, impossible
        if(maxFreq > (s.length() + 1) / 2){
            return "";
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> countFreq[b - 'a'] - countFreq[a - 'a']);
        
        for(int i=0; i<26; i++){
            if(countFreq[i] > 0){
                maxHeap.add((char) (i + 'a'));
            }
        }

        StringBuilder result = new StringBuilder();
        Character prev = null; // previous character used

        while(!maxHeap.isEmpty()){
            char current = maxHeap.poll();
            result.append(current);
            countFreq[current - 'a']--;
            
            // Re-add previous character if it still has frequency
            if(prev != null && countFreq[prev - 'a'] > 0){
                maxHeap.add(prev);
            }
            
            // Update prev only if current character still has frequency left
            prev = (countFreq[current - 'a'] > 0) ? current : null;
        }

        return result.toString();
    }
}
