package programowanie.dataStructures.kopiec;

import static programowanie.dataStructures.kopiec.Heap.isHeap;

public class HeapMain {
    public static void main(String[] arg) {


        int arr[] = {90, 15, 7, 12, 2, 7, 3};
        int n = arr.length;
        System.out.println(isHeap(arr, n));


    }
}

