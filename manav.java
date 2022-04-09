import java.util.Scanner;

public class manav {

    public static void main(String []args){

        double pear=2.14,apple=3.67,tomatoes=1.11,banana=0.95,eggplant=5.00,total;
        double pkg,akg,tkg,bkg,ekg;

        Scanner input=new Scanner(System.in);

        System.out.println("Armut kaç kilo?");
        pkg= input.nextDouble();

        System.out.println("Elma kaç kilo?");
        akg= input.nextDouble();

        System.out.println("Domates kaç kilo?");
        tkg= input.nextDouble();

        System.out.println("Muz kaç kilo?");
        bkg= input.nextDouble();

        System.out.println("Patlıcan kaç kilo ?");
        ekg= input.nextDouble();

        total=(pear*pkg) +(apple*akg) +(tomatoes*tkg) +(banana*bkg) +(eggplant*ekg);

        System.out.println("Toplam tutar:" +total);



    }
}
