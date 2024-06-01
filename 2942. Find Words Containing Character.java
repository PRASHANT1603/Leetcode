import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        String target = String.valueOf(x); // Convert char to String
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(target)) {
                indices.add(i);
            }
        }
        
        return indices;
    }
}
