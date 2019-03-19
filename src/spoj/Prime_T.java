package spoj;

public class Prime_T {

    public static void main(String [] arg){
        Prime_T prime_t = new Prime_T();
        System.out.println(isPrime(4));

    }

    public static boolean isPrime(int liczba) {
        if (liczba < 2) {
            return false;
        }
        for (int i = 2; i < liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;

            }
        }
        return true;
    }



}


