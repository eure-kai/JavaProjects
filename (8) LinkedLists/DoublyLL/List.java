
public interface List<T>  {

    int getLength();

    boolean isEmpty();

    void insertFront(T t);

    void insertBack(T t);

    void removeFront();

    void removeBack();

    T get(int index);

    void clearAll();

    String toString();
  
    String backwards();
  
    void insertAt(int i, T t);
    
    void deleteAt(int i);
  
  
}
