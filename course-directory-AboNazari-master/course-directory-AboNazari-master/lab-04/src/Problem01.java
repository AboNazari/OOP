import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        System.out.println("Before Reversing: ");
        System.out.println(numbers);
        reverseNumbers(numbers);
        System.out.println("After Reversing: ");
        System.out.println(numbers);
    }

    private static void reverseNumbers(ArrayList<Integer> nums) {
        for (int i = 0, j = nums.size() - 1; i<j; i++, j--) {
            int temp = nums.get(i);
            nums.set(i, nums.get(j));
            nums.set(j, temp);
        }
    }
}
