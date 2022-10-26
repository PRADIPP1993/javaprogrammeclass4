package javaprogrammeclass4;

public class DigitSumChallenge4 {

    public static int sumDigits(int n) {
        int sum = 0;
        if (n >= 10) {
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
        } else {
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1));

    }
}

