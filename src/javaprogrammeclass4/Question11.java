package javaprogrammeclass4;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Sum of even digits in is: " + getEvenDigitSum(22));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}


