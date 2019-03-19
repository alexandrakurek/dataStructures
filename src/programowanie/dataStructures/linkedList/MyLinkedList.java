package programowanie.dataStructures.linkedList;

import programowanie.dataStructures.linkedList.dwukierunkowaLinkedList.MyDwukierunkowaLinkedList;
import programowanie.dataStructures.linkedList.generic.GenericNode;

public class MyLinkedList {
    // lista wiazana jednokierunkowa, sklada sie z wezlow
    // tworzymy 1 element, 2 elem, ustawiamy wartosc wezla , przechodzimy na drugi, value i next,
    // next wskazuje ktory wezel jest nastepny w pamieci
    // dopoki wartoasc nie jest ta ktorej szukam to pobieram nastepny i szukam koljengo (temporary.next i kolejny przechdzimy)
    // jak dodac wart? do ostatniej dodajemy
    // int value, note next
    // ostatni to nie ma note next, ma nulla

    private int numberNodes;
    private Node head; // nasz poczatek listy, wystarczy nam 1 i wiedziec ile ich jest

    public MyLinkedList(int value) {
        head = new Node(value);
        numberNodes++;
    }



    // jak dodac na koncu listy ? znależć ostatni wezel
    public void addTail(int value) {
        // pomocnicza zmienna
        Node temp = head; // nasz poczatek
        // chce przechodzic na kolejne elementy tak dlugo jak moge
        while (temp.next != null) {
            temp = temp.next;
        }
        Node doDodania = new Node(value); // dodany kolejny ale nie polaczony
        temp.next = doDodania; // tak go dodajemy
        numberNodes++;
    }

    public int getSize() {
        return numberNodes;

    }

    public void addAtHead(int value) {

        Node newHead = new Node(value);
        newHead.next = newHead;
        numberNodes++;

    }

    public void addAtIndex(int index, int value) { // zle
        Node newNode = new Node(value);
        Node temp = head;

        for(int i=1; i< index -1; i++) {
            head = new Node(value);
            head.next = temp;
          //  newNode.next = newNode;
          //  head = newNode;
            numberNodes++;

        //    if (head == null && index == 0) {
        //        head = new TreeNode(value);
        //        newNode.next = newNode;
        //        head = newNode;
        //        numberNodes++;
            }
        }


     //   for (int i = 1; i < index - 1; i++) {
     //       temp = temp.next;
     //   }
     //   newNode.next = temp.next;
     //   temp.next = newNode;






    public Node find(int index) {
        Node temp1 = head;
        Node temp2 = head;

        for (int i = 1; i < index - 1; i++) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;

        }
        return temp2;
    }

    public void deleteAtIndex(int index) {

        Node temp = head;

        for (int i = 1; i<index -1; i++){
            temp = temp.next;
        }
       // TreeNode del = temp.next;
      //  temp.next.next = del.next;
      //  temp.next = del.next;
        temp.next = temp.next.next;

        }

        public void printList() { // nie dziala

            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value + " ");
                temp = temp.next;
            }
        }





      //  while (temp.next != null){
         //   temp = temp.next;
       // }
         //   System.out.println(temp.value);



    public int find (Node n){

        Node temp = head;
        int x =0;

        for(int i=1; i< numberNodes ; i++){
            if(n.value == temp.value){
                x ++;
                break;
            }
            temp = temp.next;
            x++;
        } return x;

    }
    public void addAtIndex(int index, Node node){

        Node temp = head;
        Node newNode = new Node(index);





    }
}





  /*


    public void switchWithNext (int index){

    }
*/






