class Main {
  public static void main(String[] args) {
    
    Queue queue = new Queue();
    
    for (int i = 0; i <= 10; i++) {
      queue.enqueue(i);
    }
    
    System.out.println("Queue: " + queue);
    System.out.println("Front: " + queue.front() + "\n");
    
    for (int i = 0; i <= 10; i++) {
      System.out.println("\nQueue: " + queue);
      System.out.println("Remove: " + queue.dequeue());
    }
    
    System.out.println("\n\nQueue: " + queue);
    
    System.out.println("Is the Queue empty? " + queue.isEmpty());
    
    System.out.println("What if we try to dequeue?" + "\n");
    queue.dequeue();
    
    //overflow();
  }
  
  public static void overflow() {
    Queue q = new Queue();
    
    for (int i = 0; i <= 999; i++) {
      q.enqueue(i);
    }
    
    System.out.println("\n\nQueue: " + q);
    System.out.println("\n\nWhat if we try to enqueue?" + "\n");
    q.enqueue(1000);
    
  }
}
