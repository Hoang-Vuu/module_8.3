package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));

        System.out.println("Original List: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("After removing even numbers: " + numbers);

        numbers.replaceAll(n -> n * 2);
        System.out.println("After doubling the odd numbers: " + numbers);

        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);
    }
}
