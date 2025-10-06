package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "Los Angeles"));
        people.add(new Person("Charlie", 35, "Chicago"));
        people.add(new Person("Diana", 28, "New York"));
        people.add(new Person("Eve", 22, "San Francisco"));

        System.out.println("=== List ===");
        people.forEach(System.out::println);
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("\n=== Sorted by age (Ascending) ===");
        people.forEach(System.out::println);
        people.removeIf(p -> !p.getCity().equalsIgnoreCase("New York"));

        System.out.println("\n=== Filtered (Only from New York) ===");
        people.forEach(System.out::println);
    }
}
