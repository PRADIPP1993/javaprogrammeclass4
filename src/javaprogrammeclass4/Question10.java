package javaprogrammeclass4;

public class Question10 {
    public static void main(String[] args) {
        int n = 153;
        int c = 0;
        int a;
        int temp;
        temp = n;

        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");

    }
}

