package programowanie.dataStructures.stos.genericStack;

public class StackElement <T> {

    T value;
    StackElement <T> nextElement;

    public StackElement(T value, StackElement<T> nextElement) { // konstruktor
        this.value = value;
        this.nextElement = nextElement;
    }

    public StackElement<T> getNextElement() {
        return nextElement;
    }

    public T getValue() {
        return value;
    }
}
