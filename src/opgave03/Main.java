package opgave03;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.println(i + " : " + threeXPlusOne(i));
        }
    }

    private static int threeXPlusOne(int x) {
        if (x == 1) return 0;
        else if (x % 2 == 0) return threeXPlusOne(x / 2) + 1;
        else return threeXPlusOne(3 * x + 1) + 1;
    }

}
