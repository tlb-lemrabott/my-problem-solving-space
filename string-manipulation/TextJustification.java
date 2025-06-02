https://leetcode.com/problems/text-justification/?envType=problem-list-v2&envId=m3r184od


public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> res = new ArrayList<>();
    int i = 0;
    while (i < words.length) {
        int lineLen = words[i].length();
        int j = i + 1;
        
        // Find the range of words to include in this line
        while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
            lineLen += 1 + words[j].length();
            j++;
        }

        // Calculate how many words and spaces are in this line
        int numWords = j - i;
        int totalSpaces = maxWidth - lineLen + (numWords - 1);

        StringBuilder sb = new StringBuilder();
        
        // If this is the last line or only one word in the line: left-justify
        if (j == words.length || numWords == 1) {
            for (int k = i; k < j; k++) {
                sb.append(words[k]);
                if (k < j - 1) sb.append(" ");
            }
            while (sb.length() < maxWidth) sb.append(" ");
        } else {
            int spaces = (maxWidth - (lineLen - (numWords - 1))) / (numWords - 1);
            int extra = (maxWidth - (lineLen - (numWords - 1))) % (numWords - 1);
            
            for (int k = i; k < j; k++) {
                sb.append(words[k]);
                if (k < j - 1) {
                    for (int s = 0; s < spaces + (k - i < extra ? 1 : 0); s++) {
                        sb.append(" ");
                    }
                }
            }
        }
        res.add(sb.toString());
        i = j;
    }
    return res;
}

