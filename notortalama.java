import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
    //Değişkenleri oluşturdum.
    int mat,fizik,kimya,turkce,tarih,muzik;

    //Scanner sınıfını oluşturdum.
    Scanner input=new Scanner(System.in);

    //Kullanıcıdan değerleri alalım.
        System.out.println("Matematik notunuz:");
        mat=input.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=input.nextInt();

        System.out.println("Kimya notunuz:");
        kimya=input.nextInt();

        System.out.println("Türkçe notunuz");
        turkce= input.nextInt();

        System.out.println("Tarih notunuz:");
        tarih= input.nextInt();

        System.out.println("Müzik notunuz:");
        muzik= input.nextInt();

        //Ortalama Hesaplama

        int ortalama=(mat+fizik+kimya+turkce+tarih+muzik )/6;
        boolean sorgu= ortalama >=60 || ortalama<60;
        String sonuc =sorgu ? "Sınıfı geçti" :"Sınıfta kaldı";

        System.out.println("Ortalamanız:" +ortalama);
        System.out.println("Sonucunuz:" +sonuc);







    }

}
