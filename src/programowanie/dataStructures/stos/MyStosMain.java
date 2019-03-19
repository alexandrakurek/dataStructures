package programowanie.dataStructures.stos;

import programowanie.dataStructures.linkedList.dwukierunkowaLinkedList.MyNode;

public class MyStosMain {
    public static void main(String[] arg) {


        MyStos mojstos = new MyStos(1);
        mojstos.push(2);
        mojstos.push(3);
        mojstos.push(4);
        mojstos.push(5);


        System.out.println(mojstos.pop().getValue());
        System.out.println(mojstos.pop().getValue());
        System.out.println(mojstos.pop().getValue());
        System.out.println(mojstos.pop().getValue());
        System.out.println(mojstos.pop().getValue());











    }
}
