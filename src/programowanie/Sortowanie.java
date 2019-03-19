package programowanie;

public class Sortowanie {
    public static int metodaBabelkowa(int[] tab) {

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[i] > tab[i + 1]) {
                    int x = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = x;
                }

            }
        }return 0;
    }

    public static void buble(int [] tab){
        for(int i = tab.length -1; i>1; i--){
            for(int j=0; i<j; j++){
                if(tab[j]> tab[j+1]){
                    int x = tab[j];
                    tab[j] = tab[j+1];
                    tab [j+1] = x;
                }
            }
        }
    }

    public static void main(String[] arg) {
        int[] tab = new int[]{12, 65, 76, 43, 13, 17};

       // System.out.println(metodaBabelkowa(tab));
        System.out.println(tab);
        buble(tab);


    }

}

