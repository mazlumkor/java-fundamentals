public class sringtoInteger {
    public static void main(String[] args) {
        String sayi = "45";
        System.out.println(sayi+10);

        int tamsayi= Integer.parseInt(sayi);//1. yöntem.
        System.out.println(tamsayi+10);

        tamsayi=Integer.valueOf(sayi);//2. yöntem.
        int toplam= tamsayi+20;
        System.out.println(toplam);

    }
}
