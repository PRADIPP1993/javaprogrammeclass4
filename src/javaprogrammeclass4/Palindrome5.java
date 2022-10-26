package javaprogrammeclass4;

public class Palindrome5 {

    public static void main(String[] args) {
        System.out.println(Palindrome(11212));

        }
        public static boolean Palindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        if (number < 0) {
            num = num * -1;
        }
        while (num > 0) {
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        if (number < 0) {
            reverse = reverse * -1;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
