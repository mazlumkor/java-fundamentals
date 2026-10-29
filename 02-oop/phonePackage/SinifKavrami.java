package phonePackage;

public class SinifKavrami {

    static void main(String[] args) {
        Phone phone = new Phone();
        phone.aramaYap(546224);
        phone.aramaKabulEt();
        System.out.println(phone.marka);
        System.out.println(phone.model);
        System.out.println(phone.ekranBoyutu);
        System.out.println(phone.UretimYili);



    }
}
