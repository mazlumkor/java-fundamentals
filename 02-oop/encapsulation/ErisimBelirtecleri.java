package encapsulation;

public class ErisimBelirtecleri {
    public static void main (String[] args){
        Kullanici kullanici = new Kullanici();

        kullanici.bilgileriYazdir();
        System.out.println(kullanici.name);


    }
}
