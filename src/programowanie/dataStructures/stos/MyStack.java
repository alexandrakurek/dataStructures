package programowanie.dataStructures.stos;

public class MyStack { // oparte na tablicy // MyArrayStack


    private int[] stack;
    private int size;
    private static final int INITIAL_SIZE = 10;

    public MyStack (){ // zainicjowanie noweog stosu z wartością
        stack = new int[INITIAL_SIZE];
    }

    public void push (int value){
        if(size == stack.length){
            doubleCapacity(); // zwiekszamy pojemnosc tablicy
        }
        stack[size] = value;
        size++;
    }

    private void doubleCapacity(){
        int newCapacity = 2*stack.length;
        int [] newStack = new int[newCapacity];
        for (int i=0; i<stack.length; i++){
            newStack[i] = stack[i];
        }
    }

    public int pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int result = stack[size - 1]; // jesli mamy 3 elementy to w indeksie jest 0 1 2 (dlatego 3-1 = 2)
        stack[size -1] = 0;
        size --;
        return result;
    }


}







    /*public MyStack(int size) { // zainicjalizowana tablica // okreslamy wielkosc stosu
        this.array = new int[size];
        top = 0;
    }


    public void push(int value) {
        array[top++] = value;

    }

    public int pop() {
        return array[--top];
    }
}

*/