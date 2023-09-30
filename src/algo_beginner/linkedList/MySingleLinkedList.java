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

    public Integer getKthItemFromLast (int k){
        // create two pointers


        // move ptr2 k-1 times

        // move both pointers until ptr2 hits the last element

        // ptr1 is on the kth element from the last

        return null;
    }



}
