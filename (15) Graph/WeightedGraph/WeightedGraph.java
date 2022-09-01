import java.util.*; 
  
public class WeightedGraph<T, W> implements Network<T, W> {   
  private HashMap<T, HashMap<T, W>> map = new HashMap<>(); 
  private int numEdges = 0;
  private boolean directed = false;
  
  public WeightedGraph(boolean d) {
    directed = d;
  }


  public int getVertexCount() {
    return map.size();
  }
  
  public int getEdgesCount() {
    return numEdges;
  }
  
  public HashMap<T, W> getEdges(T vertex) {
    return map.get(vertex);
  }
  
  public boolean hasVertex(T vertex) {
    return (map.containsKey(vertex));
  }
  
  public boolean hasEdge(T source, T destination) {
    return (map.get(source).containsKey(destination));
  }
  
  public void addVertex(T vertex) {
    if (hasVertex(vertex)) return;
    map.put(vertex, new HashMap<T, W>());
  }
  
  
  public void addEdge(T source, T destination) {
    addEdge(source, destination, null);
  }
  
  public void addEdge(T source, T destination, W weight) {
    if (hasEdge(source, destination)) return;
    
    if (!hasVertex(source)) addVertex(source);
    if (!hasVertex(destination)) addVertex(destination);
    
    map.get(source).put(destination, weight);
    if (this.directed) map.get(destination).put(source, weight);
    numEdges++;
  }
  
  
  public String toString() {
    
    String word = "";
    
    if (this.directed) word += "This graph is directed.\n\n";
    
    for (T vertex: map.keySet()) {
      word += (vertex + ": ");
      
      for (T vert: map.get(vertex).keySet()) {
        word += (vert + "(" + map.get(vertex).get(vert) + "), ");
      }
      
      word += "\n";
    }
    
    return word;
  }
  
} 
