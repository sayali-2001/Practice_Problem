package PracticeExample;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        System.out.println("Enter your Choices :");
        int x = sc.nextInt();

        switch(x){
            case 1:
                int add = a + b;
                System.out.println("Addition is : " +add);
                break;
            case 2:
                int sub = a - b;
                System.out.println("Substraction is : " +sub);
                break;
            case 3:
                int multi = a * b;
                System.out.println("Multiplication is: " +multi);
                break;
            case 4:
                int divi = a / b;
                System.out.println("Division is : " +divi);
                break;
            case 5:
                int mod = a % b;
                System.out.println("Mod is : " +mod);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
