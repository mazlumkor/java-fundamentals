public class sringtoInteger {
    public static void main(String[] args) {
        String sayi = "45";
        System.out.println(sayi+10);

        int tamsayi= Integer.parseInt(sayi);//1. yöntem.
        System.out.println(tamsayi+10);

        tamsayi=Integer.valueOf(sayi);//2. yöntem.
        int toplam= tamsayi+20;
        System.out.println(toplam);

        String sayi1 = "123456789";
        long buyuksayi = Long.parseLong(sayi1);
        System.out.println(buyuksayi+10);

        String ondalikli = "17.654";
        float fOndalik = Float.parseFloat(ondalikli);
        System.out.println(fOndalik+3);

        double dOndalik = Double.parseDouble(ondalikli);
        System.out.println(dOndalik+5);
        int tam= (int) dOndalik;
        System.out.println(tam);

        int num= 25;
        String numstring = String.valueOf(num);
        System.out.println(numstring+10);



    }
}
