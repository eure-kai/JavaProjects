public interface Map<K, V> {
  public void insert(K k, V v);
  public V remove(K k);
  public void put(K k, V v);
  public V get(K k);
  public boolean has(K k);
  public int size();
}
