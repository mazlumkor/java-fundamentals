package Methods;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void average(int num1 , int num2){
        int addition = num1+num2;
        double averagee= addition/2;
        System.out.print("Average is : "+ averagee);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();

        average(number1,number2);

    }
}