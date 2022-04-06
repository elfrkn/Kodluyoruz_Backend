
import java.util.Scanner;
public class Kdvhesap {
    public static void main(String[] args) {

        double tutar;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen tutarı giriniz:");
        tutar=input.nextDouble();



        boolean sorgu=tutar >=1000 || tutar<1000;
        double sonuc= sorgu ? tutar*0.08 : tutar*0.18;
        double toplamtutar=sonuc + tutar;

        System.out.println("Girdiğiniz tutarın Kdv oranı:"+sonuc);
        System.out.println("Toplam kdv'li tutarınız :" + toplamtutar);





    }
}
