import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What grade are you in ?");
        byte clas = input.nextByte();
        switch (clas) {
            case 1 :
                System.out.println("You are apprentice.");
                break;

            case 2 :
                System.out.println("You are journeyman.");
                break;

            case 3 :
                System.out.println("You are expert.");
                break;

            case 4 :
                System.out.println("You are professor.");
                break;

            default:
                System.out.println("Please enter a valid value.");
        }
    }



}