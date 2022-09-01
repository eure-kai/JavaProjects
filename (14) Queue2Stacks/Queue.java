public class Queue<T> {
  
  private Stack<T> stack1;
  private Stack<T> stack2;
  
  public Queue() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }
  
  public boolean isEmpty() {
    return (stack1.isEmpty() && stack2.isEmpty());
  }
  
  //helper method to move elements from one stack to another
  private void move(Stack<T> fromSt, Stack<T> toSt, int remain) {
    while (fromSt.length() > remain) {
      toSt.push(fromSt.pop());
    }
  }
  
  public T dequeue() {
    if (!stack1.isEmpty()) {
      move(stack1, stack2, 1); //move all from stack1 to stack2 except 1
      return stack1.pop(); //pop the last in stack1 and return
      
    } else {
      if (!stack2.isEmpty()) return stack2.pop(); //as long as stack2 isn't empty, pop + return
      else return null; //otherwise return null
    }
  }
  
  //add to back
  public void enqueue(T data) {
    if (!stack2.isEmpty()) move(stack2, stack1, 0); //move all elements from stack2 to stack1
    stack1.push(data); //push the data onto stack1
  }
  
  
  public T front() {
    if (isEmpty()) return null;
    
    if (!stack1.isEmpty()) move(stack1, stack2, 0); //move all elements from stack1 to stack2
    return stack2.peek(); //peek on stack2 and return
  }
  
  public int size() {
    if (isEmpty()) return 0; //obviously, empty means size 0
    else if (stack1.isEmpty()) return stack2.length();
    else return stack1.length();
  }
  
  
  public String toString() {
    if (stack2.isEmpty()) move(stack1, stack2, 0); //move all elements from stack1 to stack2
    return stack2.toString();
  }
  
  
}
