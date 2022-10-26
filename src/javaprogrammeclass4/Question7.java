package javaprogrammeclass4;

public class Question7 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(95249));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        int lastDigit = number % 10;
        int sum = lastDigit;

        while (number >= 10) {
            number /= 10;
        }

        sum += number;
        return sum;
    }
}

