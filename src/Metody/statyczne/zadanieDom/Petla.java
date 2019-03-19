package Zadania.zadanieDom;

import java.util.Scanner;

public class Petla {
    public static void main (String[] args) {

//zadanie 1
        for (int licznikPetli = 0; licznikPetli < 5; licznikPetli++) {
            System.out.println("biedronka");

        }
        //zadanie 2
        for (int a = -100; a <= 100; a = (a + 2)) {
            System.out.println(a);
        }
        //zadanie 3

        Scanner scanner = new Scanner(System.in);
        int wczytanaliczba = scanner.nextInt();
        System.out.println(wczytanaliczba);

        for (int licznikPetli = wczytanaliczba; licznikPetli >= 0; licznikPetli--) //mozna zrobic --i zamiast --
            System.out.println(licznikPetli);

        //zadanie 4 - czy musimy na nowo wpisać scanner? jak napisac liczbe podzielna przez 7 bez reszty - tzn calkowita


        for (int licznikPetli= wczytanaliczba - 1; licznikPetli > 0; licznikPetli--) {
            if (licznikPetli % 7 == 0) ;
        }
            System.out.println(wczytanaliczba);

        //zadanie 6 suma wszystkich liczb z przedziału od 0 do liczby podanej przez uzytkownika

        int suma = 0;
        for (int licznikPetli =1; licznikPetli <= wczytanaliczba; licznikPetli++) {
            suma += licznikPetli;
        }
        System.out.println(suma);



        //zadanie 7 wartosc sumy wyrazow ciagu arytmetycznego //

        for (int licznikPetli =5; licznikPetli <5 + 459*2; licznikPetli +=2) {
            suma += licznikPetli;
        }
            System.out.println(suma);

        }




}
