import java.util.Scanner;

public class ucakBilet {
    public static void main(String[] args) {
        int mesafe,yas,select;
        double  biletFiyat=0;



        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi giriniz:");
        mesafe=input.nextInt();
        System.out.println("Yaşınızı giriniz:");
        yas=input.nextInt();
        if(yas<0){
            System.out.println("Hatalı veri girdiniz!");
        }
        System.out.println("Lütfen seçiniz :1-Tek Yön 2-Gidiş/Dönüş Yön");
        select=input.nextInt();

        if(mesafe>0){
            biletFiyat=mesafe* 0.10;
        }else{
            System.out.println("Hatalı veri girdiniz!");
        }


        if(yas<12){
            biletFiyat-=biletFiyat*0.5;


        }else if(yas>=12 && yas<=24){
           biletFiyat-=biletFiyat*0.1;


        } else if(yas>65){
            biletFiyat-=biletFiyat*0.3;
            System.out.println(biletFiyat);
        }
        if(select!=1 || select!=2){
            if(select==2){
                biletFiyat-=biletFiyat*0.2;
                biletFiyat*=2;

        }else{
                System.out.println("Lütfen yolculuk tipi için 1 veya 2 değerini giriniz!");
            }

        }

        System.out.println("Toplam Tutar:"+biletFiyat+"TL");


        }

    }

