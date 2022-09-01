import java.util.*; 

class Main { 
  public static void main(String args[]) { 
    WeightedGraph<String, Integer> graph = new WeightedGraph<>(true);
    
    for (int i = 65; i <= 70; i++) {
      graph.addVertex(String.valueOf((char) i));
    }
    
    graph.addEdge("A", "F", 1);
    graph.addEdge("B", "C", 3);
    graph.addEdge("E", "D", 6);
    graph.addEdge("A", "C");
    graph.addEdge("B", "E", 5);
    graph.addEdge("B", "F", 19);
    graph.addEdge("D", "A", 5);
    
    System.out.println(graph);
    
    System.out.println("\nHas Vertex A? " + graph.hasVertex("A"));
    System.out.println("Has Vertex 6? " + graph.hasVertex("G"));
    System.out.println("Has Edge (B, C)? " + graph.hasEdge("B", "C"));
    System.out.println("Has Edge (F, D)? " + graph.hasEdge("F", "D"));
    
    System.out.println("\nEdges of B: " + graph.getEdges("B"));
     
  } 
  
} 
