import java.util.Scanner;

public class TCkimlik {
    public static void kontrolEt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your TC number:");
        String tckimlik = input.next();
        if (tckimlik.length()!=11) {
            System.out.println("Please enter your TC number correctly.");
        }else {
            char lastnumber = tckimlik.charAt(10);
            switch (lastnumber) {
                case '0' :
                    System.out.println("Your money will be deposited into your account on the 8th of the month.");
                    break;
                case '2' :
                    System.out.println("Your money will be deposited into your account on the 10th of the month.");
                    break;
                case '4' :
                    System.out.println("Your money will be deposited into your account on the 12th of the month.");
                    break;
                case '6' :
                    System.out.println("Your money will be deposited into your account on the 14th of the month.");
                    break;
                case '8' :
                    System.out.println("Your money will be deposited into your account on the 16th of the month.");
                    break;
                default:
                    System.out.println("Please enter a vaild number.");
                    break;

            }
        }
    }
}