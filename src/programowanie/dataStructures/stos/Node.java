package programowanie.dataStructures.stos;

public class Node { // MYSTOS

    int value;
    Node next;

    public Node (int value){
        this.value = value;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public int getValue(){
        return value;
    }

}

