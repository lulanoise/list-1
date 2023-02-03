package it.develhope.arraysandlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        // create a not-mutable List
        List<String> cityNames = Arrays.asList("Rome", "Milan", "Paris");

        /*
         * The following line of code is commented because it throws an UnsupportedOperationException.
         * An exception is thrown because .add() is not supported method on a not mutable List.
         */
        // cityNames.add("London"); // UnsupportedOperationException: the list is not mutable

        cityNames.set(1, "Tegucigalpa"); // set is an allowed method on a not mutable List
        System.out.println(cityNames);

        // create an empty mutable List
        List<String> kingsOfRome = new ArrayList<>();
        // let's add all the 7 kings of Rome
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        System.out.println(kingsOfRome);
        // do the conversion and the type of the array is defined using `new String[0]`
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        // edit the 7th king's value
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray)); 
    }
}