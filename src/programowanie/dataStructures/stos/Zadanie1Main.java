package programowanie.dataStructures.stos;

import java.util.ArrayDeque;
import java.util.Deque;



public class Zadanie1Main{
    public static void main (String []arg){

        System.out.println(Zadanie1.balancedParens(")()()("));
        System.out.println(Zadanie1.balancedParens("()"));
        System.out.println(Zadanie1.balancedParens("())"));

        System.out.println(Zadanie1.balancedAnyParens("[()]"));
        System.out.println(Zadanie1.balancedAnyParens("]()]"));


        Deque<Integer> kolejka = new ArrayDeque<>();
        kolejka.offer(1);
        kolejka.offer(2);
        kolejka.offer(3);
        kolejka.offer(4);
        kolejka.offer(5);

        // wyświetlenie elementów kolejki

        for(Integer element : kolejka){
            System.out.println(element.intValue());
        }

      //   Zadanie1.reverseQueue(kolejka);

      //  for(Integer element : kolejka){
     //       System.out.println(element.intValue());
       // }

        Zadanie1.reverseStack(kolejka);
        for(Integer element : kolejka){
            System.out.println(element.intValue());
        }





    }
}
