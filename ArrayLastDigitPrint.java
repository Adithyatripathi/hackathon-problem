public class ArrayLastDigitSum {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {123, 456, 789, 321};

        // Calculate and print the sum of the last digits
        int sum = sumOfLastDigits(numbers);
        System.out.println("Sum of last digits: " + sum);
    }

    // Method to calculate the sum of the last digits of an array
    public static int sumOfLastDigits(int[] arr) {
        int sum = 0;

        // Iterate through the array
        for (int number : arr) {
            // Get the last digit of each number
            int lastDigit = number % 10;

            // Add the last digit to the sum
            sum += lastDigit;
        }

        return sum;
    }
}




public class ArrayLastDigitPrint {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {123, 456, 789, 321};

        // Print the last digit of each number in the array
        printLastDigits(numbers);
    }

    // Method to print the last digit of each element in an array
    public static void printLastDigits(int[] arr) {
        System.out.println("Last digits of the array:");

        // Iterate through the array
        for (int number : arr) {
            // Get the last digit of each number
            int lastDigit = number % 10;

            // Print the last digit
            System.out.println(lastDigit);
        }
    }
}
