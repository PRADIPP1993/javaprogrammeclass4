package javaprogrammeclass4;

import java.util.Scanner;

public class Question3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
            System.out.println("Input letter is a Vowel");
        }else if((ch>='A'&& ch<='Z') || (ch>='a'&& ch<='z')){
            System.out.println("Input letter is a Consonant");
        }else{
            System.out.println("Error");
        }
    }
}

