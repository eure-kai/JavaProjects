public class Deque { 
  private final int MAX;
  private int deque[]; 
  private int nextFront;
  private int nextBack;
  private int size;
    
  public Deque(int maxSize){ 
    MAX = maxSize;
    deque = new int[MAX]; 
    nextFront = convertToIndex(0);
    nextBack = convertToIndex(1);
    this.size = 0;
  } 

 
  private int convertToIndex(int number){
    number %= MAX;
    if (number < 0) number += MAX;
    return number;
  }

 
  public boolean isFull(){ 
    return (size == MAX);
  } 
 
  public boolean isEmpty(){ 
    return (size == 0);
  } 
  
  public void insertFront(int item) {
    
    if (isFull()) throw new OverflowException();
    deque[nextFront] = item;
    nextFront = convertToIndex(nextFront - 1);
    size++;
  } 
  
  public void insertBack(int item) {
    
    if (isFull()) throw new OverflowException();
    deque[nextBack] = item;
    nextBack = convertToIndex(nextBack + 1);
    size++;
  } 
  
  
  public void removeFront() {
    if (isEmpty()) throw new UnderflowException();
    
    nextFront = convertToIndex(nextFront + 1);
    size--;
  } 
  
  public void removeBack() {
    if (isEmpty()) throw new UnderflowException();
    
    nextBack = convertToIndex(nextBack - 1);
    size--;
  } 
  

  public int getFront(){ 
    int ind = convertToIndex(nextFront + 1);
    return deque[ind];
  } 
  
  public int getBack(){
    int ind = convertToIndex(nextBack - 1);
    return deque[ind]; 
  } 

  
  @Override
  public String toString() {
    return ("[" + printDeque() + "]");
  }
  
  public String printDeque() {
    int start = convertToIndex(nextFront + 1);
    int end = convertToIndex(nextBack - 1);
    
    if (size == 0) {
      return "";
      
    } else if (size == 1) {
      return String.valueOf(deque[start]);
      
    } else {
      StringBuilder wordBuilder = new StringBuilder();
    
      for (int i = start; i <= end; i++) {
        wordBuilder.append(deque[i]);
        if (i != (end)) wordBuilder.append(", ");
      }
    
      return wordBuilder.toString();
    }
  }
  
}
