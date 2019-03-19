package programowanie;

public class MetodyAlgorytmy implements AlgorithmExercise {

    @Override
    public int nwd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    @Override
    public int nwdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return nwdRecursive(b, a % b);
        }
    }

    @Override
    public long silnia(int n) {
        int i = 1;
        int a = 1;
        while (i < n) {
            a = a * i;
            i++;

        }
        return a * n;

    }

    @Override
    public long silniaRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * silniaRecursive(n - 1));
        }
    }

    @Override
    public long suma(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }


    @Override
    public long sumaRecursive(int[] tab, int n) {


        if (n == 0) {
            return tab[n];
        } else {
            return
                    tab[n] + sumaRecursive(tab, n - 1);

        }

    }

    @Override
    public int fibonacci(int n) {
        int liczbaA = 0; // zmienne pomocnicze
        int liczbaB = 1;
        int fibWynik = 0;

        if (n < 2) {
            return n;
        } else {
            for (int i = 0; i < n - 2; i++) {
                fibWynik = liczbaA + liczbaB;
                liczbaA = liczbaB;
                liczbaB = fibWynik;

            }
            return fibWynik;
        }
    }

    @Override
    public int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacci(n - 2);
        }
    }
}

