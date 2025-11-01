//Given a graph represented as an adjacency list, perform a Depth-First Search (DFS) starting from a given node using a stack, and print the order of visited nodes.
import java.util.*;

public class DFSWithStack {
    public static void main(String[] args) {
        // Define the graph
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList());
        graph.put("D", Arrays.asList());
        graph.put("E", Arrays.asList());

        // Perform DFS starting from node 'A'
        dfs(graph, "A");
    }

    public static void dfs(Map<String, List<String>> graph, String start) {
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            String node = stack.pop();

            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " ");

                // Push neighbors in reverse order so leftmost gets visited first
                List<String> neighbors = graph.get(node);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    stack.push(neighbors.get(i));
                }
            }
        }
    }
}
