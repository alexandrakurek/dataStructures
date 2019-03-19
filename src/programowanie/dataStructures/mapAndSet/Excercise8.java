package programowanie.dataStructures.mapAndSet;

import java.util.*;

public class Excercise8 {
    public static <T> Map<T, Integer> countOccurrences(List<T> values) {
        Map<T, Integer> myMap = new HashMap<>();

        for (int i = 0; i < values.size(); i++) {
            if (myMap.containsKey(values.get(i))) { // jako parametr przyjmuje klucz i zwraca flagę informującą czy dany klucz już istnieje,
                int element = myMap.get(values.get(i)); // metoda jako parametr przyjmuje klucz i zwraca odpowiadającą mu wartość.
                element++;
                myMap.put(values.get(i), element); // dodaje parę klucz/wartość do mapy,
            } else {
                myMap.put(values.get(i), 1);
            }
        }
        return myMap;
    }

//    Funkcja zwraca mapę przypisującą każdej wartości jej ilość wystąpień w liście "values".

    //przejrzec elementy na liscie i sprawdzic czy sa powtorka czy nie,
    // w petli dodawac elementy do setu (zaw slowa)
    // add w secie zwraca true/ false (dodalo sie)
    // nie mozna dodac do setu jak cos juz takiego jest i wtedy to slowo dopisac do tego co chcdmy zwrocic- seta
    //
    public <T> Set<T> findDuplicates(List<T> values) {

        Set<T> zbiorWartosci = new HashSet<>();
        Set<T> duplikaty = new HashSet<>();

        for (T wartosc : values) {
            if (zbiorWartosci.add(wartosc) == false) {
                duplikaty.add(wartosc);
            }
        }
        return duplikaty;

    }

    // Funkcja zwraca zbiór wszystkich wartości występujących w obu podanych listach.

    public <T> Set<T> findCommonValues(List<T> list1, List<T> list2) {

        Set<T> zbiorWartsci = new HashSet<>(list1);

        //The following example the retainAll() method is used to remove
        // it's elements from a list that are not contained in the specified collection.

        zbiorWartsci.retainAll(list2);
        return zbiorWartsci;

    }

    public <T> Set<T> findCommonValues2(List<T> list1, List<T> list2) {
        Set<T> zbiorWartsci = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    zbiorWartsci.add(list1.get(i));
                }
            }

        }
        return zbiorWartsci;
    }


    public String mergeHeaders(String headers) {
        Map<String, String> myMap = new LinkedHashMap<>();
        String[] splittedString = headers.split("\n"); // dzielimy na 2
        for (int i = 0; i < splittedString.length; i++) {
            String[] keyAndValue = splittedString[i].split(":"); // znow dzielimy
            if (!myMap.containsKey(keyAndValue[0])) {
                myMap.put(keyAndValue[0], keyAndValue[1]);
            } else {
                myMap.put(keyAndValue[0], myMap.get(keyAndValue[0]) + "," + keyAndValue[1]);
            }
        }
        return myMap.toString();
    }

   /* String laczony = "aaa:123\n" + "bbb:457\n" + "aaa:123";
    String zlaczony;
    Map<String, Set<String>> map = new LinkedHashMap<>();
    String[] followingLines = laczony.split("\n");
       for (String line : laczony.split("\n")){
        String[] keyAndValue = line.split(":");
        if(map.containsKey(keyAndValue[0])){
            //dopisac
            Set temp = new HashSet(map.get(keyAndValue[0]));
            temp.add(keyAndValue[1]);
            map.put(keyAndValue[0],temp);
        } else{
            map.put(keyAndValue[0],new HashSet(Arrays.asList(keyAndValue[1])));
            //1 raz dodac do mapy
        }
    }
*/



}




















