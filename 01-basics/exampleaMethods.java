public class Main {
    public static void userRating(String userName , int rate){
        System.out.println(userName+" numed users rate is: "+ rate);
    }
    public static void userRating( int rate){
        System.out.println("Noname numed users rate is: "+ rate);

    } public static void userRating(String userName ){
        System.out.println(userName+" numed users rate is: 0");

    } public static void userRating(){
        System.out.println("Noname numed users rate is: 0");
    }






    public static void main(String[] args) {
        userRating();
        userRating(25);
        userRating("ismail");
        userRating("iso",15);

    }
}