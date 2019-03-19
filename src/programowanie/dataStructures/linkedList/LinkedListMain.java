package programowanie.dataStructures.linkedList;

public class LinkedListMain {
    public static void main(String[] arg) {
        MyLinkedList mojaLinkowanaLista = new MyLinkedList(10); // dodanie listy

        Node node1 = new Node(4);
        Node node2 = new Node(3);

        mojaLinkowanaLista.addAtIndex(3, node1);

        System.out.println(mojaLinkowanaLista.getSize());
        mojaLinkowanaLista.printList();

        mojaLinkowanaLista.addAtHead(8);
        mojaLinkowanaLista.addAtIndex(2,node2);
        System.out.println(mojaLinkowanaLista.getSize());
        mojaLinkowanaLista.addAtIndex(6,1);
        System.out.println(mojaLinkowanaLista.getSize());

    }
}


        /*int wielkosc = mojaLinkowanaLista.getSize();

        mojaLinkowanaLista.addTail(300);
        wielkosc = mojaLinkowanaLista.getSize();

        mojaLinkowanaLista.find(2);
        mojaLinkowanaLista.deleteAtIndex(2);
        mojaLinkowanaLista.printList();


        System.out.println(mojaLinkowanaLista.find(2));









    }
*/

