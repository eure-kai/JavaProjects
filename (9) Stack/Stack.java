
public class Stack { 

  public static final int MAX = 1000; 
  private int top; // Index of the topmost element
  private int[] stack; // Maximum size of Stack 


  public Stack() {
    top = -1;
    stack = new int[MAX];
  } 

  /** Returns true if the stack is empty **/
  public boolean isEmpty() { 
    return (top == -1);
  } 

  /** Pushes data onto the stack **/
  public void push(int data) {
    
    top++;
    if (top < MAX) stack[top] = data;
    else throw new OverflowException();
    
  } 

  /** Removes topmost item from the stack & returns its value **/
  public int pop() {
    
    if (top == -1) throw new UnderflowException();
    
    int temp = stack[top];
    top--;
    
    return temp;
  } 

  /** Returns value of topmost item on the stack **/
  public Integer peek() {
    if (top == -1) return null;
    return stack[top];
  } 

  @Override
  public String toString(){
    return ("Stack: [" + printStack() + "]");
  }
  
  
  public String printStack() {
    if (top == -1) return "";
      
    else if (top == 0) return String.valueOf(stack[top]);
      
    
    StringBuilder wordBuilder = new StringBuilder();
  
    for (int i = 0; i <= top; i++) {
      wordBuilder.append(stack[i]);
      if (i != top) wordBuilder.append(", ");
    }
    
    return wordBuilder.toString();
  }
  
}

