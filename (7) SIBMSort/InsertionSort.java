import java.util.*;

public class InsertionSort implements SortComparison {
  
  public List<Integer> Sort(List<Integer> arr) {
    
    for (int i = 1; i < arr.size(); i++) {
      
      int current = i;
      
      while (current > 0 && arr.get(current) < arr.get(current - 1)) {
        
        int temp = arr.get(current);
        arr.set(current, arr.get(current - 1));
        arr.set(current - 1, temp);
        
        current--;
      }
    }
    
    return arr;
  }
  
  
  public String getName() {
    return "Insertion Sort: ";
  }
  
  
}
