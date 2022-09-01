import java.util.*;

public class MergeSort implements SortComparison {

  public List<Integer> Merge(List<Integer> A, List<Integer> B) {
    
    List<Integer> arr = new ArrayList<>();
    
    while (A.size() > 0 && B.size() > 0) {
      
      if (A.get(0) < B.get(0)) {
        arr.add(A.get(0));
        A.remove(A.get(0));
        
      } else {
        arr.add(B.get(0));
        B.remove(B.get(0));
      }
    }
    
    arr.addAll(A);
    arr.addAll(B);
    
    return arr;
  }
  
  
  public List<Integer> Sort(List<Integer> arr) {
    if (arr.size() <= 1) return arr;

    int max = arr.size();
    int mid = arr.size() / 2;

    List<Integer> l = new ArrayList(arr.subList(0, mid));
    List<Integer> r = new ArrayList(arr.subList(mid, max));

    return Merge(Sort(l), Sort(r));
  }
  
  
  public String getName() {
    return "Merge Sort: ";
  }
  
}
