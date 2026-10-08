import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int deger = input.nextInt();
        int factorial=1;
        for (int i=1; i<=deger; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial is: "+ factorial);

    }


}