
class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.insertBack((int) (Math.random() * 10));
        }

        System.out.println("Here is the list: " + list);
        System.out.println("Backwards: " + list.backwards());

        System.out.println("\nLength: " + list.getLength());
        System.out.println("Is it empty? " + list.isEmpty());


        System.out.print("\n\nInsert at front: ");
        list.insertFront((int) (Math.random() * 10));
        System.out.println(list);
        System.out.println("Backwards: " + list.backwards());


        System.out.print("\nInsert at back: ");
        list.insertBack((int) (Math.random() * 10));
        System.out.println(list);
        System.out.println("Backwards: " + list.backwards());



        System.out.print("\n\nRemove the front: ");
        list.removeFront();
        System.out.println(list);
        System.out.println("Backwards: " + list.backwards());


        System.out.print("\nRemove the back: ");
        list.removeBack();
        System.out.println(list);
        System.out.println("Backwards: " + list.backwards());



        System.out.print("\n\nWhat's the value at Index 5? ");
        System.out.println(list.get(5));

        System.out.print("What about Index 8? ");
        System.out.println(list.get(8));



        System.out.print("\n\nInsert @ index 6: ");
        list.insertAt(6, (int) (Math.random() * 10));
        System.out.println(list);
        System.out.println("Backwards: " + list.backwards());


        System.out.print("\nDelete @ index 3: ");
        list.deleteAt(3);
        System.out.println(list);
        System.out.println("Backwards: " + list.backwards());



        System.out.print("\n\nLet's clear the list: ");
        list.clearAll();
        System.out.println(list);
        System.out.println("Backwards: " + list.backwards());


        System.out.println("\nIs it empty? " + list.isEmpty());

    }
}
