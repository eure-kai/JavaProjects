
class Main {
  public static void main(String[] args) {
    	
    Stack<Integer> s = new Stack<>();
    
    for (int i = 0; i <= 10; i++) {
      s.push(i);
    }
    
    System.out.println("Stack: " + s);
    System.out.println("Peek: " + s.peek() + "\n");
    
    for (int i = 0; i <= 10; i++) {
      System.out.println("\nStack: " + s);
      System.out.println("Pop: " + s.pop());
    }
    
    System.out.println("\n\nStack: " + s);
    System.out.println("Is the stack empty? " + s.isEmpty());
    	
    	
  }
}
