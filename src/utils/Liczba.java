package utils;

import java.util.Scanner;

public class Liczba {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println(liczba);

        for (int licznikPetli = 0; licznikPetli < 10; licznikPetli++) {
            System.out.println(":)");

        }

//zadanie ze slajdu while

        int wprowadzonaliczba = scanner.nextInt();
        System.out.println(wprowadzonaliczba);

        int sumaWhile = 0;
        int licznikWhile = 0;
        while (licznikWhile < 10) {
            sumaWhile += licznikWhile;
            licznikWhile++;
            System.out.println(sumaWhile);

        }
    }
}

