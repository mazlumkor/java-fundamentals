import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = input.nextInt();
        int addtoplam= 0;
        int eventoplam=0;
        for (int i = number1; i<=number2 ; i++){
            if (i % 2==0){
                addtoplam = addtoplam+ i;
            }
            else {
                eventoplam = eventoplam+i;
            }
        }
        System.out.println("The addition of odd numbers: "+ addtoplam);
        System.out.println("The addition of even numbers: "+ eventoplam);
    }
}