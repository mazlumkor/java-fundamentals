import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your midterm score: ");
        float midScore = input.nextFloat();
        midScore = midScore * 0.4f;
        System.out.print("Enter your final score: ");
        Scanner input1 = new Scanner(System.in);
        float finScore = input.nextFloat();
        finScore = finScore*0.6f;
        float total = midScore+finScore;
        if (total>60){
            System.out.println("Your score is :"+ total );
            System.out.print("You are pass.");
        }
        else if(total ==0){
            System.out.println("Your score is :"+ total );
            System.out.print("You should take the exam again.");
        }
        else{
            System.out.println("Your score is :"+ total );
            System.out.print("You failed.");
        }



    }


}