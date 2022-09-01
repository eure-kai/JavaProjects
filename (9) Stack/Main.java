
class Main {
  public static void main(String[] args) {
    
    Stack stack = new Stack();
    
    for (int i = 0; i <= 10; i++) {
      stack.push(i);
    }
    
    System.out.println(stack);
    System.out.println("Peek: " + stack.peek() + "\n");
    
    for (int i = 0; i <= 10; i++) {
      System.out.println("\n" + stack);
      System.out.println("Pop: " + stack.pop());
    }
    
    System.out.println("\n\n" + stack);
    
    System.out.println("Is the stack empty? " + stack.isEmpty());
    
    System.out.println("What if we try to pop?" + "\n");
    stack.pop(); //underflow
    
    // overflow();
  }
  
  
  public static void overflow() {
    Stack s = new Stack();
    
    for (int i = 0; i <= 999; i++) {
      s.push(i);
    }
    
    System.out.println("\n\n" + s);
    System.out.println("\n\nWhat if we try to push?" + "\n");
    s.push(1000);
    
  }
  
}
