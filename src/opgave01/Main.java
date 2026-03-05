package opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(32, 23, 13, -22, 202, 42, 53, 0));
        System.out.println("Antal lige tal = " + numberOfEvenNumbers(integers));
    }

    private static int numberOfEvenNumbers(ArrayList<Integer> integers) {
        return numberOfEvenNumbersHelper(integers, 0);
    }

    private static int numberOfEvenNumbersHelper(ArrayList<Integer> integers, int index) {
        if (index == integers.size()) return 0;
        int count;
        if (integers.get(index) % 2 == 0) {
            count = 1;
        } else {
            count = 0;
        }
        return count + numberOfEvenNumbersHelper(integers, index + 1);
    }
}
