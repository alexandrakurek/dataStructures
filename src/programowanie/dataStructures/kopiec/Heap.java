package programowanie.dataStructures.kopiec;

public class Heap {
    public int capacity = 10;
    public int size = 0;
    public int arr[] = {90, 15, 7, 12, 2, 7, 3};



    static boolean isHeap(int arr[], int n) {
        // Start from root and go till the last internal
        // node
        for (int i = 0; i <= (n - 2) / 2; i++) {
            // If left child is greater, return false
            if (arr[2 * i + 1] > arr[i]) {
                return false;
            }
            // If right child is greater, return false
            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) {
                return false;
            }
        }
        return true;
    }


    public void swap (int indexOne, int indexTwo ){

        int temp = arr[indexOne];
        arr [indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;

    }






}


