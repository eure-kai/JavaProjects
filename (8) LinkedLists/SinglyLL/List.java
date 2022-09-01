
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
}
