public class LinkedList<T> implements List<T> {


  private final class Node {

    private T data;
    private Node following;

    public Node(T d) {
      data = d;
    }

    public void setNext(Node n) {
      following = n;
    }

    public Node getNext() {
      return following;
    }

    public T getData() {
      return data;
    }

  }


  public Node head;


  public int getLength() {
    if (head == null) return 0;

    else {
      int count = 1;
      Node temp = head;

      while (temp.getNext() != null) {
        temp = temp.getNext();
        count++;
      }

      return count;
    }
  }

  public boolean isEmpty() {
    return (this.getLength() == 0);
  }




  public void insertFront(T data) {
    Node newBox = new Node(data);
    newBox.setNext(head);
    head = newBox;
  }


  public void insertBack(T data) {
    Node newBox = new Node(data);

    if (head == null) head = newBox;
    
    else {
      Node temp = head;
  
      while (temp.getNext() != null) {
        temp = temp.getNext();
      }
  
      temp.setNext(newBox);
    }
  }



  public void removeFront() {
    Node temp = head.getNext();
    head.setNext(null);
    head = temp;
  }


  public void removeBack() {
    
    Node curr = head;
    Node prev = null;

    while (curr.getNext() != null) {
      prev = curr;
      curr = curr.getNext();
    }
    
    if (prev == null) head = null;
    else prev.setNext(null);
  }




  public T get(int index) {

    if (index == 0) {
      return head.getData();

    } else {
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
    
    if (head == null) return;
    
    this.removeBack();
    this.clearAll();
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


}
