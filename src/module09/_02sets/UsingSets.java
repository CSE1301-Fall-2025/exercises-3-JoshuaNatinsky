package module09._02sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsingSets {

    public static void main(String[] args) {
        // Example: uniqueness
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // duplicate -- ignored
        System.out.println("HashSet (no duplicates): " + names);
        System.out.println("Size: " + names.size());

        // Convert a list with duplicates to a set
        List<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(2); nums.add(3);
        System.out.println("List with duplicates: " + nums);
        Set<Integer> unique = new HashSet<>(nums);
        System.out.println("Unique numbers: " + unique);

        // Set operations: union, intersection, difference
        Set<String> a = new HashSet<>();
        a.add("apple"); a.add("banana"); a.add("cherry");
        Set<String> b = new HashSet<>();
        b.add("banana"); b.add("date");

        Set<String> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference (a - b): " + difference);

        // Sorted set example
        Set<String> sorted = new TreeSet<>(a);
        System.out.println("TreeSet (sorted): " + sorted);
    }
}