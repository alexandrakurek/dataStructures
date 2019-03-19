package programowanie.dataStructures.arrayList;

import java.lang.reflect.Array;

public class MyArrrayList<E> { // klasa generycna zebysmy mogli podac elementy potem

    // pol w arrayliscie na poczatku nie widzimy, size to nasz licznik- wielkosc,

    private static final int DEFAULT_CAPACITY = 10; // dostep bedzie bez trworzenia instancji, jesli nie ustawimy 10 to pozniej mozena,
    private int size = 0; // poczatkowa wartosc wielkosci tablicy sobie ustalamy
    // niezmienialna i dla wszystkich taka sama // tablica 6 lementow pustych
    private Object elements[];

    public MyArrrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element) { // wstawiamy w miejscu size element i pozniej zwiekszymy wielkosc
        //odwolujemy sie do elementu, size jest 0 i zwiekszamy, dodajemy element w miejsce poczatkowe, size zwiekszony do 1
        // size wskazuje gdzie bedzie dodawac kolejny element, jak jest wypelniony to za nim wstawiamy element
        if (size == elements.length) {
            increasedCapacity();
        }
        this.elements[size++] = element; // this odwoluje sie do tego pola klasy
    }

    private void increasedCapacity() { // zwieksza tablice o iles miejsca
        int newSize = elements.length * 2;
        Object[] nowaTablica = new Object[newSize];
        System.arraycopy(elements, 0, nowaTablica, 0, elements.length);
        elements = nowaTablica;

    }

    public E get(int index) {
        if (index >= size || index < 0) { // zeby nie dodał elementu poza wielkosc tablicy
            throw new IndexOutOfBoundsException("Index" + index + "Size" + size); // rzuca nam wyjatek indexoutofboundexeption
        }
        return (E) elements[index];
    }
}
