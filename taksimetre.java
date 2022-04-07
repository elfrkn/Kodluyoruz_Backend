import java.util.Scanner;

public class taksimetre {

    public static void main(String[] args){

        int kilometre;
        double perkm=2.20,total,startPrice=10;

        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi kilometre cinsinden giriniz:");
        kilometre= input.nextInt();

        total=(kilometre*perkm);
        total+=startPrice;

        total=(total < 20) ? 20 : total;
        System.out.println("Toplam tutar:"+total);










    }


}
