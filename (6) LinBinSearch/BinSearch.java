
import java.util.*;

public class BinSearch implements Search {

  public boolean search(List<Integer> arr, int targ) {
    
    int min = 0;
    int max = arr.size() - 1;
    int mid = (min + max) / 2;
    
    if (arr.get(mid) == targ) return true;
    else if (min > max) return false;
    
    else {
      
      if (targ < arr.get(mid)) {
        return search(arr.subList(0, mid), targ);
        
      } else {
        return search(arr.subList(mid + 1, max + 1), targ);
      }
      
    }
    
  }
  
  
  public String getName() {
    return "Binary Search";
  }
  
}
