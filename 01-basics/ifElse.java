import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write your exam scoore: ");
        int score= input.nextInt();
        if (score>50) {
            System.out.println("You are pass.");
        } else if (score == 50) {
            System.out.print("pass but not good");

        } else
        {
            System.out.println("You are failed.");
        }


    }
}