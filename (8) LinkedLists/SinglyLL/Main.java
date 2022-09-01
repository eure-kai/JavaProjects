
class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.insertBack((int) (Math.random() * 10));
        }

        System.out.println("Here is the list: " + list);
        System.out.println("\nLength: " + list.getLength());
        System.out.println("Is it empty? " + list.isEmpty());


        System.out.print("\nInsert at front: ");
        list.insertFront((int) (Math.random() * 10));
        System.out.println(list);

        System.out.print("Insert at back: ");
        list.insertBack((int) (Math.random() * 10));
        System.out.println(list);


        System.out.print("\nRemove the front: ");
        list.removeFront();
        System.out.println(list);

        System.out.print("Remove the back: ");
        list.removeBack();
        System.out.println(list);



        System.out.print("\nWhat's the value at Index 5? ");
        System.out.println(list.get(5));

        System.out.print("\nLet's clear the list: ");
        list.clearAll();
        System.out.println(list);

        System.out.println("Is it empty? " + list.isEmpty());
    
    }
}
