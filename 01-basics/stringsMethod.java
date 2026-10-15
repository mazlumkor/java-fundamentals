public class stringsMethod {
    public static void main(String[] args) {
        String name ="mazlum";
        name = name.concat(" ");
        String secondname ="kör";
        String allname = name.concat(secondname);

        System.out.println(name.length());//Metnin uzunluğunu(tüm karakter sayısını)verir.
        System.out.println(name.toUpperCase());//Metindeki kelimeleri büyük harfe çevirir.
        System.out.println(name.toLowerCase());//Metindeki kelimeleri küçük harfe çevirir.
        System.out.println(name.concat(secondname));//İki ayrı string değişkenini birleştirir.
        System.out.println(name.trim());//Baştaki ve sondaki boşlukları siler.
        System.out.println(name.charAt(3));//Girilen konumdaki karakteri yazdırır.
        System.out.println(name.indexOf("m"));//İstenilen indexin konumunu(değer sırasını)yazar.
        System.out.println(name.substring(0,3));// 0,1,2 karakterlerini gösterdi.
        System.out.println(name.contains("lum"));//Metinde aradığın şey var mı yok mu(true/false) bakar.
        name = name.replace("Mazlum","Ahmet");/*İsim değişkeni içerisindeki değişkeni
        ileride kolaylıkla değiştirebilirsin.*/
        System.out.println(name);
        String sentence = "How is going life?";
        String[] words = sentence.split(" ");
        for (int i=0 ; i< words.length ; i++){
            System.out.println(words[i]);
        }










    }
}
