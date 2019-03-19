package programowanie;

public class Algorytm {

    public static void main(String[] arg) {

        MetodyAlgorytmy obiektKlasyMetodyAlgorytmy = new MetodyAlgorytmy();

        int [] tablicaLiczb = new int[]{3,5,8};



        System.out.println(obiektKlasyMetodyAlgorytmy.nwd(5,10));
       System.out.println(obiektKlasyMetodyAlgorytmy.nwdRecursive(5,10));
        System.out.println(obiektKlasyMetodyAlgorytmy.silnia(4));
        //System.out.println(metodyAlgorytmy.suma());

        System.out.println(obiektKlasyMetodyAlgorytmy.fibonacci(5));
        System.out.println(obiektKlasyMetodyAlgorytmy.fibonacciRecursive(5));

        System.out.println(obiektKlasyMetodyAlgorytmy.suma(tablicaLiczb));
        System.out.println(obiektKlasyMetodyAlgorytmy.sumaRecursive(tablicaLiczb,tablicaLiczb.length-1));















    }




}
