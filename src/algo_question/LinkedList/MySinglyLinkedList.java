package algo_question.LinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new node object from data
        Node node = new Node(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void printNodes(){
        Node current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.id+"=> null");
            else {
                System.out.print(current.id+"=> ");
            }
            current=current.next;
        }
    }


    public void deleteNodesInPattern(int m, int n) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            // Keep the first m nodes
            for (int i = 0; i < m && current != null; i++) {
                prev = current;
                current = current.next;
            }

            // Remove the next n nodes
            for (int i = 0; i < n && current != null; i++) {
                current = current.next;
            }

            // Connect the previous node to the current node (skipping n nodes)
            prev.next = current;
        }
    }



}





