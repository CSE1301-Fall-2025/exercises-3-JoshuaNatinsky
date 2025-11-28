package module09._01lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingLists {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("rabbit");
        System.out.println("Initial list: " + animals);
        System.out.println("Size: " + animals.size());

        animals.add(1, "parrot"); // insert
        System.out.println("After insert: " + animals);

        animals.remove("cat"); // remove by value
        System.out.println("After remove 'cat': " + animals);

        System.out.println("Contains 'dog'? " + animals.contains("dog"));
        System.out.println("Index of 'rabbit': " + animals.indexOf("rabbit"));

        System.out.print("Iterate (for-each): ");
        for (String a : animals) System.out.print(a + " ");
        System.out.println();

        Collections.sort(animals);
        System.out.println("Sorted: " + animals);
    }
}