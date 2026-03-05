package opgave04;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{-17, -3, 0, 5, 27, 42, 1001, Integer.MAX_VALUE};
        boolean found = contains(intArray, 42);
        System.out.println(found);
    }

    private static boolean contains(int[] candidates, int candidate) {
        return binarySearch(candidates, candidate, 0, candidates.length - 1);
    }

    private static boolean binarySearch(int[] candidates, int target, int low, int high) {
        if (low > high) return false;

        int mid = (low + high) / 2;
        if (candidates[mid] == target) return true;
        else if (candidates[mid] > target) return binarySearch(candidates, target, low, mid - 1);
        else return binarySearch(candidates, target, mid + 1, high);
    }
}
