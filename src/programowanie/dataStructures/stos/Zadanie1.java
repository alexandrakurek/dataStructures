package programowanie.dataStructures.stos;

import programowanie.dataStructures.stos.genericStack.Stack;

import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

import static javafx.scene.input.KeyCode.T;

public class Zadanie1 {


    public static boolean balancedParens(String input) {

        Deque<Character> stack = new ArrayDeque<>();
        char[] elements = input.toCharArray(); // dzieli nam stringi bo chcemy porownac kazdy osobny element -> char

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == '(') {
                stack.push(elements[i]);
            } else {
                if (elements[i] == ')' && stack.isEmpty() != true) { //&coś jest na stosie
                    stack.pop();
                } else { //jeśli już nic nie ma na stosie
                    return false;
                }
            }

        }
        if (stack.isEmpty() != true) { //jeśli rzeczywiście coś jeszcze zostało na stosie
            return false;

        }
        return true; // wszystko się sparowało! - do wywołania w mainie potraktować soutem :)
    }


    public static boolean balancedAnyParens(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            } else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            } else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            }
        }
        return stack.isEmpty();
    }

// odwrocona kolejka

    public  static <T>  void reverseQueue(Deque<T> queue) { // np. 3, 5, 8 -> 8, 5, 3
        if (!queue.isEmpty()) { // jesli kolejka nie jest pusta to zdejmnij z niej 1 element
            T element = queue.poll(); // jeden element usun
            reverseQueue(queue);
            queue.offer(element); // jeden element dodaj na koniec
        }
    }

    // zlaczyc wracajac do tej samej kolejki dopisac queue.offer(element) (jak dojdziemy do konca to chcemy wrzucac na gore)
    // trzeba zmnieszac dane w rekurencji bo inaczej ona caly czas by trwala
    // T element = queue.poll(); // zmniejszamy kolekje o 1
    // juz zmniejszone o 1 element i mozemy wywolac siebie sama
    //  reverseQueue(queue);
    // chcemy zakonczyc to robimy if

    // ODWROCONY STOS


    public  static <T> void reverseStack(Deque<T> eDeque) {
        if (!eDeque.isEmpty()) {
            T element = eDeque.pollLast();
            reverseStack(eDeque);
            eDeque.offer(element);

        }


    }

}
















