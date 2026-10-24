
import atmPaketi.AtmIslemler;

import java.util.Scanner;

public static void main(String[] args) {
        AtmIslemler atmislemler = new AtmIslemler();
        Scanner input = new Scanner(System.in);

        boolean calisiyor=true;
        while (calisiyor) {
            System.out.println("Para yatirmak icin 1, para cekmek icin 2, bakiye ögrenmek icin 3 e basınız.");
            System.out.println("Lutfen bir değer giriniz (1,2,3):");
            int sayi = input.nextInt();
            if (sayi == 1) {
                System.out.println("Lutfen yatirmak istediginiz degeri giriniz :");
                int miktar = input.nextInt();
                atmislemler.paraEkle(miktar);
            } else if (sayi == 2) {
                System.out.println("Lutfen cekmek istediginiz degeri giriniz :");
                int miktar = input.nextInt();
                atmislemler.paraCek(miktar);
            } else if (sayi == 3) {
                System.out.println("Guncel bakiye : " + atmislemler.toplamPara);
            } else if(sayi==0){
                System.out.println("Cikis yapiliyor.");
                calisiyor= false;
            }
            else{
                System.out.println("Lutfen geçerli bir sayi giriniz.");
            }
        }input.close();

}
