public class HashMap<K extends Comparable<K>, V> implements Map<K, V> {

  private final class Node {
    private final K key;
    private V value;
    private boolean tombStone; //marks node as deleted

    public Node(K k, V v) {
      this.key = k;
      this.value = v;
      this.tombStone = false;
    }


    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V val) {
      value = val;
    }

    public boolean isDeleted() {
      return tombStone;
    }

    public void setTomb(boolean b) {
      tombStone = b;
    }

    @Override
    public String toString() {
      return this.key + ": " + this.value;
    }
  }

  public int numNodes;
  public int tableSize;
  private Object[] hashTable; //use object to avoid generic array creation;
  private final double loadFactor = 0.5; //factor that causes rehash


  public HashMap(int size) {
    this.numNodes = 0;
    this.tableSize = size;
    this.hashTable = new Object[tableSize];
  }


  private int hash(K key) {

    int num = 0;
    String temp = String.valueOf(key);
    char[] chars = temp.toCharArray();

    for (char c: chars) {
      num += c;
    }

    num *= (int) (Math.random() * 2000) + 1;

    num = num % tableSize;
    return num;
  }



  private double loadFactor() {
    return (double) numNodes / tableSize;
  }


  @SuppressWarnings("unchecked") //avoid error from unchecked Node cast
  private int getIndex(K key, boolean inserting) {

    int code = hash(key);

    if (inserting) {
      if (hashTable[code] == null) return code; //if inserting, you want an empty spot

      int index = code;
      while (hashTable[index] != null) {
        Node n = (Node) (hashTable[index]); //this is the unchecked cast

        if (n.isDeleted()) return index; //if it's deleted, insert there
        index = (index + 1) % tableSize;
      }

        return index;

    } else {
      Node temp = (Node) hashTable[code];
      if ((temp != null && !temp.isDeleted()) && temp.getKey() == key) return code;

      int index = (code + 1) % tableSize;
      while (true) {
        Node n = (Node) (hashTable[index]);

        if ((n != null && !n.isDeleted()) && n.getKey() == key) break;
        if (index == code) return -1; //if you've looped through the whole thing, then return -1 as a signal that the node doesn't exist in the hashmap
        index = (index + 1) % tableSize;
      }

      return index;
    }
  }


  //insert a key value pair
  @Override
  public void insert(K key, V value) {

    if (has(key)) return; //if the key's already in it, you can't insert

    int index = getIndex(key, true);
    hashTable[index] = new Node(key, value);
    numNodes++;

    double currFact = loadFactor();

    if (currFact > loadFactor) {
      System.out.println("Reached Load Factor, REHASHING...");
      rehash();
    }
  }


  //remove a key and its value from the hashMap
  @Override
  @SuppressWarnings("unchecked")
  public V remove(K key) {

    if (!has(key)) return null; //if the key isn't already in it, you can't remove

    int index = getIndex(key, false);

    Node n = (Node) hashTable[index];
    n.setTomb(true);
    numNodes--;

    return n.getValue();
  }


  //update the value of a key in the hashMap
  @Override
  @SuppressWarnings("unchecked")
  public void put(K key, V value) {
    if (!has(key)) return; //if the key isn't already in it, you can't put

    int index = getIndex(key, false);
    Node n = (Node) hashTable[index];
    n.setValue(value);
  }


  //get the value of a key in the hashMap
  @Override
  @SuppressWarnings("unchecked")
  public V get(K key) {
    if (!has(key)) return null; //if the key isn't already in it, you can't get

    int index = getIndex(key, false);
    Node n = (Node) hashTable[index];
    return n.getValue();
  }


  //checks whether a key is in the hashMap
  @Override
  public boolean has(K key) {
    int index = getIndex(key, false);
    return (index != -1);
  }


  //returns how many elements are in the hashMap
  @Override
  public int size() {
    return numNodes;
  }

  //makes the hashTable larger
  @SuppressWarnings("unchecked")
  private void rehash() {

    Object[] copy = hashTable;
    hashTable = new Object[tableSize * 2];

    for (int i = 0; i < tableSize * 2; i++) {
      hashTable[i] = null;
    }

    numNodes = 0;
    tableSize *= 2; //tableSize multiplied by 2

    for (Object o : copy) {
      Node n = (Node) o;
      if (n != null) insert(n.getKey(), n.getValue());
      }
  }


  @SuppressWarnings("unchecked")
  public String toString() {
    StringBuilder ob = new StringBuilder();
    ob.append("{");

    for (int i = 0; i < tableSize; i++) {
      Node n = (Node) hashTable[i];

      if (n != null && !n.isDeleted()) ob.append(n);

      if (i < tableSize - 1) ob.append(", ");
    }

    ob.append("}");
    return ob.toString();
  }
}
