/**
 * Created by adityadev on 11/15/16.
 */
public class PrintOddNumbersInRange {
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        int pointer = -1;

        System.out.println("Odd numbers in the Range 0 to 100:");
        while ((pointer += 2) < MAX_VALUE) {
            System.out.print(pointer + "\t");
        }

    }
}
