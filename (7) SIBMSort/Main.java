import java.util.*;

class Main {
  
  public static void main(String[] args) {

    SortComparison[] sortArray = {new SelectionSort(), new InsertionSort(), new BubbleSort(), new MergeSort()}; //array of sort algorithms

    List<List<Integer>> sizes = setupLists(); //setup different size lists
    
    run(sortArray, sizes.get(0), 100); //1000 numbers, 100 times
    run(sortArray, sizes.get(1), 10); //10000 numbers, 10 times
    run(sortArray, sizes.get(2), 1); //50000 numbers, 1 time
  }
  
  
  
  
  public static List<List<Integer>> setupLists() {
    List<Integer> s1000 = Arrays.asList(new Integer[1000]);
    List<Integer> s10000 = Arrays.asList(new Integer[10000]);
    List<Integer> s50000 = Arrays.asList(new Integer[50000]);
    
    List<List<Integer>> sizes = new ArrayList<>();
    
    sizes.add(s1000);
    sizes.add(s10000);
    sizes.add(s50000);


    for (List<Integer> arr: sizes) {
      for (int i = 0; i < arr.size(); i++) {
        arr.set(i, ((int) (Math.random() * 1000000)));
      }
    }
    
    return sizes;
    
  }
  


  public static void run(SortComparison[] s1, List<Integer> arr, int te) {
    
    System.out.println("\n");
    System.out.println(arr.size() + " numbers\n" + te + " tests\n");

    for (SortComparison s : s1) {
      long start = System.currentTimeMillis();

      for (int j = 0; j < te; j++) {
        s.Sort(clone(arr)); //sort a copy of the array
      }

      long end = System.currentTimeMillis();
      double time = end - start;

      System.out.println(s.getName() + time / 1000 + " seconds");

    }
    
  }


  public static List<Integer> clone(List<Integer> old) {
    List<Integer> newCopy = new ArrayList<>();
    newCopy.addAll(old);
    return newCopy;
  }




}
