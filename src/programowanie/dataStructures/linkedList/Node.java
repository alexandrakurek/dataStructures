package programowanie.dataStructures.linkedList;

public class Node {

    //to jest nasze koleczko

    int value;
    Node next;


    public Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
