package algo_question.LinkedList;

public class RemoveTest {
    public static void main(String[] args) {
        MySinglyLinkedList nodeList=new MySinglyLinkedList();

        for (int i = 1; i < 13; i++) {
            nodeList.add(i);
        }

        nodeList.printNodes();
        nodeList.deleteNodesInPattern(2,3);
        nodeList.printNodes();



    }
}
