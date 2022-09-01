public class Stack<T> {
  
  private LinkedList<T> stack;
  
  public Stack() {
    stack = new LinkedList<>();
  }
  
  public T pop() {
    T temp = this.peek();
    stack.removeFront();
    return temp;
  }
  
  public void push(T data) {
    stack.insertFront(data);
  }
  
  public T peek() {
    return stack.get(0);
  }
  
  public boolean isEmpty() {
    return stack.isEmpty();
  }
  
  
  public String toString() {
    return stack.toString();
  }
  
  
}
