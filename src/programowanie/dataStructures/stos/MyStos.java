package programowanie.dataStructures.stos;

public class MyStos {

    int numberNodes = 0; // wysokosc naszego stosu
    Node head;


    public MyStos(int value) { // konstuktor
        head = new Node(value);
        this.numberNodes++;
    }

    public void push(int value) { // wartosc ktora chcemy dodac do stosu
        Node newElement = new Node(value); // nowy element
        newElement.next = head; // dorzucamy go na gore stosu (ten co jest pod nim dodajemy go na gore)
        numberNodes++;
        head = newElement; // naszym headem jest moj nowy node(dodany)
    }

    public Node pop() {  // odejmujemy element z gory
        Node temp = head;
        head = head.next;
        numberNodes--;
        return temp;
    }






}




