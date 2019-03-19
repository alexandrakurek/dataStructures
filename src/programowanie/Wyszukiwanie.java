package programowanie;

import java.util.*;


public class Wyszukiwanie {
    public static void main(String[] arg) {

        int[] tablicaLiczb = new int[]{2, 16, 19, 54};

        Arrays.sort(tablicaLiczb);

        System.out.println(Arrays.toString(tablicaLiczb));

        //  System.out.println("Proszę podać szukaną liczbę");

        binarySearch(tablicaLiczb, 16);


    }

    public static void binarySearch(int[] tablicaLiczb, int x) {


        int n;
        n = tablicaLiczb.length; // las
        int lowerBound = 1; // first
        int upperBound = n; // last
        // int midPoint = lowerBound + (upperBound - lowerBound) / 2;


        if (lowerBound > upperBound) {
            System.out.println("x does not exist");
        }


        int midPoint = lowerBound + (upperBound - lowerBound) / 2;

        while (upperBound > lowerBound ++) {

            if (tablicaLiczb[midPoint] < x) {
                lowerBound = midPoint + 1;
            } else if (tablicaLiczb[midPoint] > x) {
                lowerBound = midPoint - 1;
            } else if (tablicaLiczb[midPoint] == x) {
                System.out.println(" x found at location midpoind" + tablicaLiczb[midPoint]);
                break;

            }
        }

    }
}











