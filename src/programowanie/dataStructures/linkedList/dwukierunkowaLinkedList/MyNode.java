package programowanie.dataStructures.linkedList.dwukierunkowaLinkedList;

public class MyNode {
    public MyNode next;
    public MyNode previous;
   public int value;



    public MyNode(){
        next = null;
        previous = null;
    }

    public MyNode (int value, MyNode next, MyNode previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
    public MyNode (int value){
        this.value = value;
    }
    public int getValue(){ // pobierz wartość
        return value;
    }
    public MyNode getNext(){ // pobierz następny
        return next;
    }
    public MyNode getPrevious(){ // pobierz poprzedni
        return previous;
    }
    public void setNext(MyNode next){ // ustaw następny
        this.next = next;
    }
    public void setPrevious(MyNode previous){ // ustaw poprzedni
        this.previous = previous;
    }

}
