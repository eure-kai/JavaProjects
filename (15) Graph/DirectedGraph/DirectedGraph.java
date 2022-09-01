import java.util.*; 
  
public class DirectedGraph<T> implements Graph<T> {   
  private HashMap<T, ArrayList<T>> map = new HashMap<>(); 
  private int numEdges = 0;
   
   
  public int getVertexCount() {
    return map.size();
  }
  
  public int getEdgesCount() {
    return numEdges;
  }
  
  public boolean hasVertex(T vertex) {
    return (map.containsKey(vertex));
  }
  
  public boolean hasEdge(T source, T destination) {
    return (map.get(source).contains(destination));
  }
  
  public void addVertex(T vertex) {
    if (hasVertex(vertex)) return;
    map.put(vertex, new ArrayList<T>());
  }
  
  
  public void addEdge(T source, T destination) {
    if (hasEdge(source, destination)) return;
    
    if (!hasVertex(source)) addVertex(source);
    if (!hasVertex(destination)) addVertex(destination);
    
    map.get(source).add(destination);
    numEdges++;
  }
  
  
  public String toString() {
    String word = "";
    
    for (T node: map.keySet()) {
      word += (node + ": " + map.get(node) + "\n");
    }
    
    return word;
  }
} 
