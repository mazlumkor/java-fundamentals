package atmPaketi;

public class AtmIslemler {
    public int toplamPara;

    public void paraEkle(int miktar){
        toplamPara +=miktar;
        System.out.println("Hesabınıza " +miktar+ " tl para eklendi.");
        System.out.println("Güncel bakiye : "+ toplamPara);
    }
    public void paraCek(int miktar){
        if (miktar<=toplamPara){
            toplamPara -=miktar;
            System.out.println("Hesabınızdan " +miktar+ " tl para çekildi.");
            System.out.println("Güncel bakiye : "+ toplamPara);
        }
        else {
            System.out.println("Bakiye yetersiz.");
        }
    }
    public void bakiyeGoster(){
        System.out.println(toplamPara);
    }

}
