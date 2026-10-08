import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String kullaniciAdi = input.nextLine();
        System.out.print("Please enter your password: ");
        String password = input.nextLine();

        if (password.equals("172534") && kullaniciAdi.equals("admin")) {
            System.out.println("Login succesful.");
        } else {
            System.out.println("Login failed. ");
        }
    }
}