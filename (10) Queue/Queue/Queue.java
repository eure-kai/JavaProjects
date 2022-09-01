public class Queue {
  private final int MAX;	
  private int[] queue; 
  private int front; 
  private int nextBack;	
  private int size;		
	
	
  public Queue(){
    MAX = 1000;
    queue = new int[MAX];
    front = 0;
    nextBack = 0;
    size = 0;
  }


  public Boolean isEmpty(){
    return (size == 0);
  }

  public Boolean isFull(){
    return (size == MAX);
  }


  public int dequeue() {

    if (isEmpty()) throw new UnderflowException();

    int temp = queue[front];
    front = (front + 1) % MAX;
    size--;

    return temp;
  }


  public void enqueue(int item) {
    if (isFull()) throw new OverflowException();

    queue[nextBack] = item;
    nextBack = (nextBack + 1) % MAX;
    size++;
  }


  public int front() {
    if (isEmpty()) throw new UnderflowException();
    return queue[front];
  }


  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return ("[" + printQueue() + "]");
  }

  public String printQueue() {
    if (size == 0) {
      return "";

    } else if (size == 1) {
      return String.valueOf(queue[front]);

    } else {
      StringBuilder wordBuilder = new StringBuilder();

      for (int i = 0; i < size; i++) {
	int index = (front + i) % MAX;
	wordBuilder.append(queue[index]);
	if (i != (size - 1)) wordBuilder.append(", ");
      }

    return wordBuilder.toString();
    }
  }
	
}
