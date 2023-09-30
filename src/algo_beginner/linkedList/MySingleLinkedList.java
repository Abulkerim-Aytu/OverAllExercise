package algo_beginner.linkedList;

public class MySingleLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){return head== null;}

    void addFirst(int data){
        // Create a new node object from data
        Node node = new Node(data);
        // case 1: list empty
        if (isEmpty()){
            head=tail=node;
        }else { // case 2 : list is not empty
            node.next= head;
            head=node;
        }
        size++;
    }

    void add(int data){
        // create a new node object from data
        Node node = new Node(data);
        if (isEmpty()){
            head=tail=node;
            size++;
        }else {
            tail.next=node;
            tail=node;
            size++;
        }
    }

    void printNodes(){
        Node current = head;
        while (current!=null){
            System.out.println(current.id);
            current=current.next;
        }
    }

    public Integer getKthItemFromLast (int k){
        // create two pointers
        Node h1 = head;
        Node h2 = head;
        // move ptr2 k-1 times
        for (int i = 0; i < k-1; i++) {
            h2=h2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (h2.next!=null){
            h1=h1.next;
            h2=h2.next;
        }
        // ptr1 is on the kth element from the last

        return h1.id;
    }

    void deleteById(int id){
        // check if empty
        if (isEmpty()) System.out.println("List is Empty!!!");
        // assign prev and current with the head
        Node current = head;
        Node prev=head;
      // there is a match
        while (current!=null){
            if (current.id==id){
                //case 1: head
                if (current==head){
                 head=current.next;
                 current.next=null;
                }
                // case 2 : tail
                if (current==tail){
                    tail=prev;
                    prev.next=null;//Ex -Tail will be eligible for Garbage Collection
                }
                // case 3 : middle
                else {
                    prev.next=current.next;
                    current.next=null;
                };
                // after deletion
                size--;
            }
            // move forward on the elements of the list
            prev=current;
            current=current.next;
    }



    }



}
