import java.util.List;

class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {
        "Liberal Arts",
        "Student Services",
        "Health Careers & Sciences",
        "Health Technologies Center",
        "Recreation Center",
        "Technology Learning Center",
        "Business & Technology",
        "Theatre"
    };
    // 2-Define Edges
    int[][] edges = {
        { 0, 1 }, { 1, 0 },
        { 0, 7 }, { 7, 0 },
        { 7, 6 }, { 6, 7 },
        { 6, 1 }, { 1, 6 },
        { 1, 5 }, { 5, 1 },
        { 1, 2 }, { 2, 1 },
        { 2, 3 }, { 3, 2 },
        { 2, 4 }, { 4, 2 },
        { 5, 4 }, { 4, 5 }
    };
    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business
    // & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology"));
    // 5. Retrieve and print the search order of the DFS traversal
    List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() +
        " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();
    System.out.println();
    // 6. Print the parent-child relationships for each vertex during the DFS
    // traversal
    System.out.println("Parent-child relationships:");
    for (int i = 0; i < searchOrders.size(); i++) {
      int v = searchOrders.get(i);
      int parent = dfs.getParent(v);
      if (parent != -1) {
        System.out.println("Parent of " + graph.getVertex(v) +
            " is " + graph.getVertex(parent));
      } else {
        System.out.println(graph.getVertex(v) + " is the root");
      }
    }
    System.out.println();
    // 7. Call the printPath method (assuming this method exists in the
    // UnweightedGraph class)
    dfs.printPath(graph.getIndex("Health Technologies Center"));
    System.out.println();
    dfs.printPath(graph.getIndex("Student Services"));
    System.out.println();
    dfs.printPath(graph.getIndex("Recreation Center"));
    System.out.println();
    System.out.println();
    // 8. Call printTree() to print the entire DFS tree (assuming this method exists
    // in the UnweightedGraph class)
    dfs.printTree();
  }
}