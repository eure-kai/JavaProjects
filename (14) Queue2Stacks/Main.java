class Main {
  public static void main(String[] args) {
  	Queue<Integer> q = new Queue<>();
  	
  	System.out.println("Is the queue empty? " + q.isEmpty());
  	System.out.println("Try to dequeue at start: " + q.dequeue());
  	q.enqueue(1);
  	q.enqueue(2);
  	q.enqueue(3);
  	
  	for (int i = 0; i < 10; i++) {
  	  q.enqueue((int) (Math.random() * 100));
  	}
  	
  	System.out.println("\n" + q + "\n");
  	
  	for (int i = 1; i <= 5; i++) {
  	  System.out.println("\nRemove front: " + q.front());
  	  q.dequeue();
  	  System.out.println(q);
  	}
  	
  	System.out.println("\n\nIs the queue empty? " + q.isEmpty());
  }
}
