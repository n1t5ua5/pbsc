public class IntegerStore {
    public static void main (String[] args) {
        // Initialize array with nine integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Integers from first to last:");
        for (int i = 0; i < numbers.length; i++) {
            // Loop through array from first element to last
            System.out.println(numbers[i] + " ");
            // Display integers from first to last
        }

        System.out.println("Integers from last to first:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            // Loop through array from last element to first
            System.out.println(numbers[i] + " ");
            // Display integers from last to first
        }
    }
}
