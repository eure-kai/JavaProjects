import java.util.*; 

public interface Network<T, W> extends Graph<T> {
  
  //each edge has a weight
  public void addEdge(T source, T destination, W weight);

  //return the edges of a vertex, HashMap - keys are vertices and values are weights of edges
  public HashMap<T,W> getEdges(T vertex);
}
