package kapsullemeOrnek;

public class Ogrenci {
    private String name;
    private String surname;
    private int studentNumber;
    private int birthYear;

    public String getName() {
        String fullName = name+" "+surname;
        return fullName;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Please enter your name: " );
        }else{
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty()){
            System.out.println("Please enter your surname: " );
        }else{
            this.surname = surname;
        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if (studentNumber>1000){
            this.studentNumber = studentNumber;
        }
        else{
            System.out.println("Your student number should be more than 1000.");
        }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear>1900 && birthYear<2027){
            this.birthYear = birthYear;
        }
        else{
            System.out.println("Please enter a valid number");
        }
    }
}
