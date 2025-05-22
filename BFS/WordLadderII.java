https://leetcode.com/problems/word-ladder-ii/description/?envType=problem-list-v2&envId=breadth-first-search

public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    Set<String> wordSet = new HashSet<>(wordList);
    List<List<String>> res = new ArrayList<>();
    if (!wordSet.contains(endWord)) return res;
    Map<String, List<String>> graph = new HashMap<>();
    Map<String, Integer> distance = new HashMap<>();
    bfs(beginWord, endWord, wordSet, graph, distance);
    List<String> path = new ArrayList<>();
    dfs(endWord, beginWord, graph, distance, path, res);
    return res;
}

private void bfs(String beginWord, String endWord, Set<String> wordSet, Map<String, List<String>> graph, Map<String, Integer> distance) {
    Queue<String> queue = new LinkedList<>();
    queue.offer(beginWord);
    distance.put(beginWord, 0);
    while (!queue.isEmpty()) {
        int size = queue.size();
        boolean foundEnd = false;
        for (int i = 0; i < size; i++) {
            String word = queue.poll();
            int curDist = distance.get(word);
            for (String next : getNeighbors(word, wordSet)) {
                graph.computeIfAbsent(next, k -> new ArrayList<>()).add(word);
                if (!distance.containsKey(next)) {
                    distance.put(next, curDist + 1);
                    if (next.equals(endWord)) foundEnd = true;
                    else queue.offer(next);
                }
            }
        }
        if (foundEnd) break;
    }
}
private void dfs(String word, String beginWord, Map<String, List<String>> graph, Map<String, Integer> distance, List<String> path, List<List<String>> res) {
    path.add(word);
    if (word.equals(beginWord)) {
        List<String> copy = new ArrayList<>(path);
        Collections.reverse(copy);
        res.add(copy);
    } else {
        for (String prev : graph.getOrDefault(word, new ArrayList<>())) {
            if (distance.get(word) == distance.get(prev) + 1) {
                dfs(prev, beginWord, graph, distance, path, res);
            }
        }
    }
    path.remove(path.size() - 1);
}

private List<String> getNeighbors(String word, Set<String> wordSet) {
    List<String> neighbors = new ArrayList<>();
    char[] arr = word.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        char old = arr[i];
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == old) continue;
            arr[i] = c;
            String next = new String(arr);
            if (wordSet.contains(next)) {
                neighbors.add(next);
            }
        }
        arr[i] = old;
    }
    return neighbors;
}

