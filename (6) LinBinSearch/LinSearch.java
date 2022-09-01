
import java.util.*;

public class LinSearch implements Search {
  
  public boolean search(List<Integer> arr, int targ) {
    
    for (int num: arr) {
      if (num == targ) return true;
    }
    
    return false;
  }
  
  
  public String getName() {
    return "Linear Search";
  }
  
}
