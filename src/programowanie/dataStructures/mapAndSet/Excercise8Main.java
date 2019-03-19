package programowanie.dataStructures.mapAndSet;

import java.util.*;

public class Excercise8Main {

    public static void main (String [] arg){
        List <Integer> values = new ArrayList<>();
        values.add(4);
        values.add(7);
        values.add(9);
        values.add(5);
        values.add(3);
        values.add(3);
        values.add(3);
        values.add(3);
        values.add(3);


        Excercise8 excercise8 = new Excercise8();


        System.out.println(excercise8.findDuplicates(values));
        System.out.println(excercise8.countOccurrences(values));


        List <Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(6);
        list2.add(3);
        list2.add(4);

        System.out.println(excercise8.findCommonValues(values,list2));
        System.out.println(excercise8.findCommonValues2(values,list2));

      //  String [] temp = new String[]{"aaa:123", "bbb:897", "aaa:432"};

        System.out.println(excercise8.mergeHeaders("aaaa:123"));








    }




}
