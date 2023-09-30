package algo_beginner.linkedList;

public class TestNode {
    public static void main(String[] args) {
        MySingleLinkedList myList= new MySingleLinkedList();

        int[] array = {1,2,4,5,7,8,9,10};

        for (int i = 0; i < array.length; i++) {
            myList.addFirst(array[i]);
        }

        myList.printNodes();


    }






}
