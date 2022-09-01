import java.util.*;

public class SelectionSort implements SortComparison {
  
  public List<Integer> Sort(List<Integer> arr) {
    
    for (int i = 0; i < arr.size(); i++) {
      
      int smallest = i;
      
      for (int j = i + 1; j < arr.size(); j++) {
        if (arr.get(j) < arr.get(smallest)) smallest = j;
      }
      
      int temp = arr.get(smallest);
      
      arr.set(smallest, arr.get(i));
      arr.set(i, temp);
    }
    
    return arr;
  }
  
  
  public String getName() {
    return "Selection Sort: ";
  }
  
  
}
