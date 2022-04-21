import java.util.Scanner;

public class sinifgecme {

    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,dersSayisi,toplam;
        toplam=0;
        dersSayisi=0;
        Scanner inp=new Scanner(System.in);

        System.out.println("Matematik notunu giriniz:");
        mat= inp.nextInt();
        if(mat>=0 && mat<=100 ){
            toplam+=mat;
            dersSayisi++;

        }

        System.out.println("Fizik notunu giriniz:");
        fizik= inp.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam+=fizik;
            dersSayisi++;
        }

        System.out.println("Türkçe notunu giriniz:");
        turkce= inp.nextInt();
        if(turkce>=0 && turkce<=100){
            toplam+=turkce;
            dersSayisi++;
        }

        System.out.println("Kimya notunu giriniz:");
        kimya= inp.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam+=kimya;
            dersSayisi++;
        }

        System.out.println("Müzik notunu giriniz:");
        muzik= inp.nextInt();
        if(muzik>=0 && muzik<=100){
            toplam+=muzik;
            dersSayisi++;
        }

        double ortalama=toplam/dersSayisi;
        if(ortalama>=55){
            System.out.println("Tebrikler!Sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız!");
        }
        System.out.println("Ortalamanız:"+ortalama);
    }

}
