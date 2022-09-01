
public class DoublyLinkedList<T> implements List<T> {


  private class Node {

    private T data;
    private Node following;
    private Node previous;

    public Node(T d) {
      data = d;
    }

    public void setNext(Node n) {
      following = n;
    }
    
    public void setPrev(Node n) {
      previous = n;
    }

    public Node getNext() {
      return following;
    }
    
    public Node getPrev() {
      return previous;
    }

    public T getData() {
      return data;
    }

  }


  public Node head;
  public Node tail;


  public int getLength() {
    if (head == null && tail == null) return 0;
    
    else {
      int count = 1;
      Node temp = tail;
      
      while (temp.getPrev() != null) {
        temp = temp.getPrev();
        count++;
      }
      
      return count;
    }
    
  }

  public boolean isEmpty() {
    return (this.getLength() == 0); //can be more efficient
  }




  public void insertFront(T data) {
    Node newBox = new Node(data);
    
    if (isEmpty()) tail = newBox;
    else head.setPrev(newBox);
    
    newBox.setNext(head);
    head = newBox;
  }



  public void insertBack(T data) {
    Node newBox = new Node(data);
    
    if (isEmpty()) head = newBox;
    else tail.setNext(newBox);
    
    newBox.setPrev(tail);
    tail = newBox;
  }
  


  public void removeFront() {
    Node temp = head;
    
    if (head == tail) tail = null;
    
    else {
      Node next = head.getNext();
      next.setPrev(null); //disconnect head.getNext() with head
    }
    
    head = head.getNext();
    temp.setNext(null); //disconnect head with head.getNext();
  }



  public void removeBack() {
    Node temp = tail;
    
    if (head == tail) head = null;
    
    else {
      
      Node previous = tail.getPrev();
      previous.setNext(null); //disconnect tail.getPrev() with tail
    }
    
    tail = tail.getPrev();
    temp.setPrev(null); //disconnect tail with tail.getPrev()
  }



  public T get(int index) {

    if (index == 0) return head.getData();
    else if (index == this.getLength() - 1) return tail.getData();
    
    else {
      Node temp = head;

      for (int i = 0; i < index; i++) {
        if (temp.getNext() != null) {
          temp = temp.getNext();
        
        } else {
          throw new IndexOutOfBoundsException();
        }
      }
        
      return temp.getData();
    }
  }



  public void clearAll() {
    
    while (tail.getPrev() != null) {
      tail = tail.getPrev();
      tail.setNext(null);
    }
    
    tail = null;
    head = null;
  }



  public String toString() {
    return "[" + toStringHelper(head) + "]";
  }
  

  
  public String toStringHelper(Node n) {
    
    if (n == null) return "";
    
    
    String word;
    T data = n.getData();
    
    if (n.getNext() == null) {
      word = String.valueOf(data);
    }
    
    else {
      word = String.valueOf(data) + ", " + toStringHelper(n.getNext());
    }
    
    return word;
  }
  
  
  public String backwards() {
    
    return "[" + backwardsHelper(tail) + "]";
    
  }
  
  
  public String backwardsHelper(Node n) {
    
    if (n == null) return "";
    
    
    String word;
    T data = n.getData();
    
    if (n.getPrev() == null) {
      word = String.valueOf(data);
    }
    
    else {
      word = String.valueOf(data) + ", " + backwardsHelper(n.getPrev());
    }
    
    return word;
  }
  
  
  public void insertAt(int index, T data) {
    
    if (index == 0) this.insertFront(data);
    else if (index == this.getLength() - 1) this.insertBack(data);
    
    else {
      Node temp = head;
      
      for (int i = 0; i < index - 1; i++) {
        temp = temp.getNext(); //eventually (index - 1)th position
      }
      
      Node newBox = new Node(data);
      Node follow = temp.getNext(); //(index)th position
      
      //Disconnect (index - 1)th position with current (index)th position
      temp.setNext(null);
      follow.setPrev(null);
      
      //Connect (index - 1)th position with the new node
      temp.setNext(newBox);
      newBox.setPrev(temp);
      
      //Connect newBox with the node that was previously (index)th pos.
      newBox.setNext(follow);
      follow.setPrev(newBox);
    }
    
  }



  public void deleteAt(int index) {
    
    if (index == 0) this.removeFront();
    else if (index == this.getLength() - 1) this.removeBack();
    
    else {
      Node temp = head;
      
      for (int i = 0; i < index - 1; i++) {
        temp = temp.getNext(); //temp will be (index - 1)th pos.
      }
      
      Node delete = temp.getNext(); //delete is the (index)th pos.
      Node follow = delete.getNext();
      
      //Disconnect temp with delete
      temp.setNext(null);
      delete.setPrev(null);
      
      //Disconnect delete with follow
      delete.setNext(null);
      follow.setPrev(null);
      
      //Connect temp with (index + 1) pos.
      temp.setNext(follow);
      follow.setPrev(temp);
    }
    
  }


}
