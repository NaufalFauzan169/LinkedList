public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd("Syihab");
        list.insertAtBeginning("Rizky");
        list.insertAtEnd("Alfa");
        list.insertAtEnd("Tora");

        // Print the list
        System.out.println("Linked List after insertions:");
        list.printList(); // Expected: Rizky -> Syihab -> Alfa -> Tora -> null

        // Insert after a specific node
        Node nodeSyihab = list.getNode("Syihab");
        if (nodeSyihab != null) {
            list.insertAfter(nodeSyihab, "Ojan");
        }

        // Print the list after insertAfter
        System.out.println("\nLinked List after inserting Ojan after Syihab:");
        list.printList(); // Expected: Rizky -> Syihab -> Ojan -> Alfa -> Tora -> null

        // Delete a node
        list.deleteNode("Alfa");

        // Print the list after deletion
        System.out.println("\nLinked List after deleting Alfa:");
        list.printList(); // Expected: Rizky -> Syihab -> Ojan -> Tora -> null

        // Delete a non-existent node
        list.deleteNode("Haaris");

        // Print the list after trying to delete non-existent node
        System.out.println("\nLinked List after trying to delete Haaris:");
        list.printList(); // Expected: Rizky -> Syihab -> Ojan -> Tora -> null
    }
}