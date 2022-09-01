class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>(16);
    map.insert("Rob", 14);
    map.insert("Bob", 12);
    map.insert("James", 18);
    map.insert("Mary", 16);
    map.insert("Robert", 21);
    map.insert("Susan", 20);
    map.insert("Karen", 32); //notice the age
    map.insert("Richard", 22);
    
    System.out.println("Name and Age HashMap: " + map);
    System.out.println("Size of hashMap: " + map.size());
    
    System.out.println("\nIs Rob in the data: " + map.has("Rob"));
    
    System.out.print("\nRemove James: ");
    map.remove("James");
    System.out.println(map);
    
    System.out.println("\nIs James in the data: " + map.has("James"));
    
    
    System.out.print("\nMary got older. Age changed: ");
    map.put("Mary", 17);
    System.out.println(map);
    
    System.out.println("\nWhat is Mary's age: " + map.get("Mary"));
    
    System.out.println("\n\nInserting Cal and David...");
    map.insert("Cal", 1);
    map.insert("David", 6);
    
    System.out.println("\n\nNew, larger hashMap: " + map);
    System.out.println("\nSize of hashMap: " + map.size());
    
  }
}
