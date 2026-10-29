package kapsullemeOrnek;

import java.util.Scanner;

public class KapsullemeOrnek {
    static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        ogrenci.setName(name);




        System.out.print("Please enter your surname: ");
        String surname =input.nextLine();
        ogrenci.setSurname(surname);




        System.out.print("Please enter your student number: ");
        int studentNumber= input.nextInt();
        ogrenci.setStudentNumber(studentNumber);




        System.out.print("Please enter your birth year: ");
        int birthYear =input.nextInt();
        ogrenci.setBirthYear(birthYear);






        System.out.println(ogrenci.getName());
        System.out.println(ogrenci.getSurname());
        System.out.println(ogrenci.getStudentNumber());
        System.out.println(ogrenci.getBirthYear());










    }
}
