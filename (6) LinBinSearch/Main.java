
import java.util.*;

class Main {
    public static void main(String[] args) {
    	
    	List<Integer> arr = new ArrayList<>();
    	
    	System.out.println("Creating an array with 100,000 elements...");
    	
    	for (int i = 0; i < 100000; i++) {
    	  arr.add(i);
    	}
    	
    	Search[] array = {new LinSearch(), new BinSearch()};
    	
    	for (Search s: array) {
    	  System.out.println("\nRunning " + s.getName() + "...");
    	  runSearch(arr, s);
    	}
    	
    }
    
    
    public static void runSearch(List<Integer> arr, Search s) {
      
      long start = System.currentTimeMillis();
      int targ = (int) (Math.random() * 100000);
      
      for (int i = 0; i < 100000; i++) {
        s.search(arr, targ);
      }
      
      long end = System.currentTimeMillis();
      double time = end - start;
      
      System.out.println(time / 1000 + " seconds");
        
    }
      
      
}
    
