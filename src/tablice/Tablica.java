/*package tablice;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {

        int nowaTablica[] = new int[]{1, 3, 5, 10};

        System.out.println(nowaTablica[1]);
        System.out.println(nowaTablica[2]);

        int i; // wartosc z tabeli
// wypisanie wszystkich liczb z tabeli
        for (i = 0; i < nowaTablica.length; i++) {
            System.out.println(nowaTablica[i]);
        }
        // wypisanie wszystkich liczb z parzystym indeksem z tabeli

        for (i = 0; i < nowaTablica.length; i++) {
            if (i % 2 == 0) {
                System.out.println(nowaTablica[i]);
            }
        }
        // wypisanie wszystkich liczb parzystych z tabeli

        for (i = 0; i < nowaTablica.length; i++) {
            if (nowaTablica[i] % 2 == 0) {
                System.out.println(nowaTablica[i]);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println(liczba);

        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j < i; j++) {
                    System.out.println(i);
                }
            }


            //tworzenie tablicy
        int[][] tablica2D = new int[10][10];
            //petla zewnetrzna generuje indeksy rzedow
        for (int k = 1; k < tablica2D.length; k++) {
            //petla wewnetrzna geneuje indeksy kolumn
            for (int j = 1; j < tablica2D.length; j++) {
                tablica2D[i][j] = k * j;

                System.out.println(tablica2D[i][j]);
                }
            }
        }
    }





*/






