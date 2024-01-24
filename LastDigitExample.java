public class LastDigitExample {
    public static void main(String[] args) {
        int[] numbers = {774, 998, 988, 993, 565};

        System.out.println("Last digits:");

        int newNumber = 0;
        for (int number : numbers) {
            int lastDigit = number % 10;
            System.out.println("Last digit of " + number + " is " + lastDigit + ".");
            newNumber = newNumber * 10 + lastDigit;
        }

        System.out.println("\nTherefore, the number formed is " + newNumber + ".");
    }
}
