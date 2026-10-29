package encapsulation;

public class Kullanici {
    private String name="mez";
    private String surname=" cez";
    private int number;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number<100 && number>0){
            this.number=number;
        }
        else{
            System.out.println("Please enter your name corretly.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void bilgileriYazdir(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(number);
        System.out.println(email);

    }

}
