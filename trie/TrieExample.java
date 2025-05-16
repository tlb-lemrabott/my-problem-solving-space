class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false;
}

class Trie {
    private TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null) {
                node.children[i] = new TrieNode();
            }
            node = node.children[i];
        }
        node.isEnd = true;
    }

    // Return the shortest prefix (root word) for the given word
    public String getShortestPrefix(String word) {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null) {
                return word; // no prefix match
            }
            prefix.append(c);
            node = node.children[i];
            if (node.isEnd) {
                return prefix.toString(); // found shortest root
            }
        }
        return word; // no root word matches
    }
}

public String replaceWords(List<String> dictionary, String sentence) {
    Trie trie = new Trie();
    // Step 1: Build the trie using dictionary
    for (String root : dictionary) {
        trie.insert(root);
    }
    // Step 2: Split sentence into words
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();
    // Step 3: Replace each word with its shortest root prefix
    for (String word : words) {
        String replacement = trie.getShortestPrefix(word);
        result.append(replacement).append(" ");
    }
    // Step 4: Remove trailing space and return
     return result.toString().trim();
}