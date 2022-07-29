public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedList();

        
        myList.addNode(new Node("President"));
        myList.addNode(new Node("Primeminister"));
        myList.addNode(new Node("Judge"));

      
        System.out.println("\nThe Printing list:");
        myList.printList();

        
        System.out.println("\nAfter insertAfter method:");
        myList.insertAfter(0, new Node("king"));
        myList.insertAfter(2, new Node("Queen"));
        myList.printList();

        
        System.out.println("\nAfter insertBefore method:");
        myList.insertBefore(0, new Node("Mayor"));
        myList.insertBefore(5, new Node("World"));
        myList.printList();


        System.out.println("\nAfter removeNodeAt method:");
        myList.removeNodeAt(5);
        myList.removeNodeAt(0);
        myList.printList();

        System.out.println("\nPrinting index positions of given values:");
        System.out.println(myList.indexOf("President"));
        System.out.println(myList.indexOf("king"));
        System.out.println(myList.indexOf("Mayor"));
        System.out.println(myList.indexOf("Queen"));
    }
}
