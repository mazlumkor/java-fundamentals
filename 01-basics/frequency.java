import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter mass: ");
        int kutle = input.nextInt();
        System.out.print("please enter the area : ");
        int alan = input.nextInt();

        System.out.print("Force is : "+ kutle * alan );



    }
}