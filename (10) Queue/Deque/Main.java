class Main {
  public static void main(String[] args) {
    
    Deque deque = new Deque(15);
    
    for (int i = 0; i < 7; i++) {
      int rand = (int) (Math.random() * 100);
      deque.insertBack(rand);
    }
    
    System.out.println(deque);
    System.out.println("Front: " + deque.getFront());
    System.out.println("Back: " + deque.getBack());
    
    
    System.out.println("\nRemove Front:");
    deque.removeFront();
    System.out.println(deque);
    
    System.out.println("\nRemove Back:");
    deque.removeBack();
    System.out.println(deque);
    
    
    System.out.println("\n\nInsert at Front:");
    deque.insertFront((int) (Math.random() * 100));
    System.out.println(deque);
    
    System.out.println("\nInsert at Back:");
    deque.insertBack((int) (Math.random() * 100));
    System.out.println(deque);
    
    
    for (int i = 0; i < 7; i++) {
      deque.removeBack();
    }
    
    System.out.println("\n\nClear the deque: " + deque);
    System.out.println("Is the deque empty? " + deque.isEmpty());
    System.out.println("\n\nWhat happens if we try to remove an element?\n");
    deque.removeBack();

  }
}
