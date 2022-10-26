package javaprogrammeclass4;

public class Question6 {
    // Function to demonstrate printing pattern
    public static void printTriangle(int n) {
        // number of spaces
        int k = 2 * n - 2;

        // outer loop to handle number of rows
        //  n in this case
        for (int i = 1; i < n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = 1; j <= k; j++) {
                // printing spaces
                System.out.print("");
            }

            // decrementing k after each loop
            k = k - 2;

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 1; j <= i; j++) {
                // printing stars
                System.out.print(" " + j);
            }

            // ending line after each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String [] args) {

       // Scanner xyz = new Scanner(System.in);
        //xyz.nextLine();
        int n= 11 ;
        printTriangle(n);
    }
}



