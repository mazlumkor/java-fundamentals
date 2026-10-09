//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void findAverage(int num1,int num2){
        int addition = num1 + num2;
        double average = addition / 2;
        System.out.println(average);
    }
    public static void findAverage(int num1,int num2,int num3){
        int addition = num1 + num2+ num3;
        double average = addition / 3;
        System.out.println(average);
    }


    public static void main(String[] args) {
         findAverage(25,35);
         findAverage(44,57,65);
    }
}