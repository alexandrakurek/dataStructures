package programowanie.dataStructures.linkedList.generic;

import programowanie.dataStructures.linkedList.Node;

public class GenericLinkedList <E>{



    private int numberNodes; // size
    private GenericNode <E> head; // glowa
    private GenericNode <E> tail; // ogon
    private GenericNode <E> value;
    private GenericNode <E> currentNode;
    private GenericNode <E> element;


    public int getSize() {
        return numberNodes;
    }

    public GenericLinkedList (E element){ //poczatek
        head = new GenericNode<>(element);
        numberNodes ++;
    }

    public GenericLinkedList(GenericNode<E> value, GenericNode<E> element) {
        this.value = value;
        this.element = element;
    }


    public GenericLinkedList(int numberNodes, GenericNode<E> head, GenericNode<E> tail, GenericNode<E> value, GenericNode<E> currentNode) {
        this.numberNodes = numberNodes;
        this.head = head;
        this.tail = tail;
        this.value = value;
        this.currentNode = currentNode;
    }

    public void addTail(E value){ // dziala
        GenericNode newGenericNode = head;
        while (newGenericNode.nextNode != null ){
            newGenericNode = newGenericNode.nextNode;
        }
        GenericNode doDodania = new GenericNode(value);
        newGenericNode.nextNode = doDodania;
        numberNodes ++;
    }



   /* public void addAtHead (E element){ // nie dziala
        GenericNode <E> newHead = new GenericNode<>(element);
        newHead.nextNode = newHead;

        head = new GenericNode<>(element,value);
        numberNodes ++;
    }
*/

    public void addAtIndex(int index, E value) { // dziala // cos nie tak
        GenericNode<E> newGenericNode = new GenericNode(value);

        if (head == null && index == 0) {
            head = new GenericNode<>(value);

        }
    }







    public void printGenericList (){ // nie dziala
        GenericNode <E> genericNode = head;
        while (genericNode.nextNode != null){
            genericNode = genericNode.nextNode;
        }
        System.out.println(genericNode.toString());
    }

    @Override
    public String toString() {
        return "genericNode" + this.value;


    }

    public void print(){

    }


    public int getNumberNodes() {
        return numberNodes;
    }

    public GenericNode<E> getHead() {
        return head;
    }

    public GenericNode<E> getTail() {
        return tail;
    }

    public GenericNode<E> getValue() {
        return value;
    }

    public GenericNode<E> getCurrentNode() {
        return currentNode;
    }
}
