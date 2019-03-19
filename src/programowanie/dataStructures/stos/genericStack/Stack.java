package programowanie.dataStructures.stos.genericStack;

public class Stack<T> { // te type of value stored in this Stack

    int size;
    StackElement<T> top;

    public Stack() { // konstruktor
        size = 0;
        top = null;
    }

    public static void main(String[] arg) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(11);
        stack.push(10);
        stack.push(15);

        System.out.println(stack.peek());
        System.out.println(stack.peek() -1);



    }

    public void push(T newValue) {
        StackElement<T> newElement = new StackElement<T>(newValue, top);
        top = newElement;
        size++;
    }

    public T pop() {
        StackElement<T> oldTop = top;

        if (oldTop == null) { // size == 0
            return null;
        }
        top = top.getNextElement();
        size--;
        return oldTop.getValue();
    }

    public T peek() {

        if (size == 0) {
            return null;
        } else {
            return top.getValue();
        }

    }





}




