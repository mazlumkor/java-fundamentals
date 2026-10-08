import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter short side : ");
        int kisakenar = input.nextInt();
        System.out.print("Plese enter long side : ");
        int longside = input.nextInt();
        int alan = kisakenar * longside;
        System.out.print("Area is: "+ alan);


    }
}