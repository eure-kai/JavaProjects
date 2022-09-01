import java.util.*; 

class Main { 
  public static void main(String args[]){
    DirectedGraph<Integer> dg = new DirectedGraph<>();
    
    for (int i = 1; i <= 5; i++) {
      dg.addVertex(i);
    }
    
    dg.addEdge(1, 5);
    dg.addEdge(1, 2);
    dg.addEdge(2, 3);
    dg.addEdge(2, 4);
    dg.addEdge(3, 4);
    dg.addEdge(4, 1);
    dg.addEdge(4, 3);
    dg.addEdge(5, 3);
    
    System.out.println(dg);
    System.out.println("Vertex Count: " + dg.getVertexCount());
    System.out.println("Edge Count: " + dg.getEdgesCount());
    
    System.out.println("\nHas Vertex 3? " + dg.hasVertex(3));
    System.out.println("Has Vertex 6? " + dg.hasVertex(6));
    System.out.println("Has Edge (1, 5)? " + dg.hasEdge(1, 5));
    System.out.println("Has Edge (3, 2)? " + dg.hasEdge(3, 2));
    
  }
} 
