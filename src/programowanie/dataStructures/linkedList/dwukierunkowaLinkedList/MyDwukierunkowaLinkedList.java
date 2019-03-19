package programowanie.dataStructures.linkedList.dwukierunkowaLinkedList;

import programowanie.dataStructures.linkedList.Node;

public class MyDwukierunkowaLinkedList {

    private MyNode first; // poczatek
    private MyNode last; // koniec
    private MyNode value;

    public MyDwukierunkowaLinkedList(MyNode value) {
        this.value = value;
    }

    public MyNode getFirst() {
        return first;
    }

    public MyNode getLast() {
        return last;
    }

    public MyNode getValue() {
        return value;
    }

    public boolean isEmpty() { // czy jest pusta, jak tak to zwracamy nulla
        return first == null;
    }
    // pobieranie elementu z listy - przechodzenie po wszystkich elementach od poczatku do zadanego indeksu

    public MyNode getMyNode(int index) {
        if (isEmpty() || index < 0) {
            throw new IndexOutOfBoundsException("Index" + index); // jesli jest poza wielkoscia, dodajemy index
        }
        MyNode currentNode = first;
        int currentIndex = index;
        while (currentIndex > 0) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index" + index);
            }
            currentNode = currentNode.getNext();
            currentIndex--;
        }
        return currentNode;
    }


    // dodawanie elementu do listy, musimy ogarnac dodawanie do pustej listy, dodawanie na koniec i poczatek
    // dodawanie pomiedzy

    public void addAtLast(int index, int value) { // dodanie na koniec
        MyNode nodeAtIndex = getMyNode(index);
        MyNode newNode = new MyNode(index);
        MyNode previous = nodeAtIndex.previous;
        previous.next = newNode;
        newNode.previous = previous;
        newNode.next = nodeAtIndex;
        nodeAtIndex.previous = newNode;

        if (nodeAtIndex == null) {
            MyNode previousLast = last; // jesli wpisany bedzie mial nulla, to przedostatni bedzie ostatnim
            last = new MyNode(value);
            last.previous = previousLast;
            previousLast.next = last;
        }
    }

    public void addAtBegining(int index, int value) { //dodawanie na poczatku
        MyNode nodeAtIndex = getMyNode(index);
        MyNode newNode = new MyNode(index);
        MyNode previous = nodeAtIndex.previous;
        previous.next = newNode; // poprzedni lastepnego to nowy node
        newNode.previous = previous; // nowy node poprzedniego - poprzedni
        newNode.next = nodeAtIndex; // nowy nastepnego - ten z indeksem
        nodeAtIndex.previous = newNode; //- nowy z indexem poprzedniego - nowy node
        if (nodeAtIndex.previous == null) {
            MyNode previousFirst = first;
            first = new MyNode(value);
            first.next = previousFirst; // kolejny bedzie poprzednim kolejnego
            previousFirst.next = first; //poprzedni kolejnego bedzie nowym pierwszym

        }
    }

    // usuniecie pierwszego i ostatniego

    public MyNode remove(int index) {

        MyNode nodeToRemove = getMyNode(index);
        MyNode previousNode = nodeToRemove.previous;
        MyNode nextNode = nodeToRemove.next;
        MyNode removedNode = nodeToRemove;


        // usuniecie pierwszego
        if (previousNode == null) {
            if (nextNode == null) {
                first = null;
                last = null;
            } else {
                first = nextNode;
                nextNode.previous = null;
            }
        }
        return removedNode;
    }

    // usuniecie ostatniego

    public MyNode removeTheENd(int index) {

        MyNode nodeToRemove = getMyNode(index);
        MyNode previousNode = nodeToRemove.previous;
        MyNode nextNode = nodeToRemove.next;
        MyNode removedNode = nodeToRemove;


        if (nextNode == null) {
            last = previousNode;
            previousNode.next = null;

        } return removedNode;

    }


}
