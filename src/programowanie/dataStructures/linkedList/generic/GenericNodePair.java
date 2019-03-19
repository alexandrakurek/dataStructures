package programowanie.dataStructures.linkedList.generic;

public class GenericNodePair <E>{
    private final GenericNode <E> previous;
    private final GenericNode <E> current;

    private GenericNodePair (GenericNode <E> previous, GenericNode <E> current){
        this.previous = previous;
        this.current = current;
    }

    public GenericNode<E> getPrevious() {
        return previous;
    }

    public GenericNode<E> getCurrent() {
        return current;
    }
}
