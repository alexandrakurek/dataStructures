package programowanie.dataStructures.linkedList.generic;

import programowanie.dataStructures.linkedList.Node;

public class GenericNode <E>{


    private E value;
    public  GenericNode <E> nextNode;
    public GenericNode <E> previous;


    public GenericNode(E value, GenericNode<E> nextNode, GenericNode<E> previous) {
        this.value = value;
        this.nextNode = nextNode;
        this.previous = previous;
    }



    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public GenericNode (E value){
        this.value = value;

    }

    public GenericNode <E> getNextNode(){
        return nextNode;
    }
    public void setNextNode (GenericNode <E> nextNode){
        this.nextNode = nextNode;
    }

    public GenericNode<E> getPrevious() {
        return previous;
    }
    public void setPrevious (GenericNode<E> previous){
        this.previous = previous;
    }
}
