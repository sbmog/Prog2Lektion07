package opgave02;

public class Main {
    public static void main(String[] args) {
        String palindrom = "ibofobi";
        String notPalindrom = "roller";

        System.out.println("Er " + palindrom + " et palindrom? " + isPalindrom(palindrom));
        System.out.println("Er " + notPalindrom + " et palindrom? " + isPalindrom(notPalindrom));
    }

    private static boolean isPalindrom(String text) {
        return palindromHelper(text, 0, text.length() - 1);
    }

    private static boolean palindromHelper(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return palindromHelper(text, left + 1, right - 1);
    }
}
