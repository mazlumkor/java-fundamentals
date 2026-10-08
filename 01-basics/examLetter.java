import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your midterm score: ");
        float MidScore = input.nextFloat();
        if (MidScore>100){
            System.out.println("Please write your true scoore.");
        }
        else if (MidScore < 0){
            System.out.println("Please write a positive scoore.");
        }

        MidScore = MidScore * 0.4f;
        System.out.println("Your midtorm score is: "+ MidScore);

        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter your final score: ");
        float FinScore = input.nextFloat();
        if (FinScore>100){
            System.out.println("Please write your true scoore.");
        }
        else if (FinScore < 0){
            System.out.println("Please write a positive scoore.");
        }


        FinScore = FinScore * 0.6f;
        System.out.println("Your final score is: "+ FinScore);

        Float TotalScore = FinScore + MidScore ;
        System.out.println("Your total score is: "+ TotalScore);

        if (TotalScore<100){
            System.out.print("");

        }
        if (TotalScore>=90){
            System.out.print("AA");
        }
        else if (TotalScore>=85){
            System.out.print("BA");
        }
        else if (TotalScore>=75){
            System.out.print("BB");
        }
        else if (TotalScore>=65){
            System.out.print("CB");
        }
        else if (TotalScore>=55){
            System.out.print("CC");
        }
        else if (TotalScore>=45){
            System.out.print("CD");
        }
        else if (TotalScore>=35){
            System.out.print("DD");
        }
        else if (TotalScore<35){
            System.out.print("FF");
        }
        else {
            System.out.println("Please enter your score correctly.");
        }




    }
}