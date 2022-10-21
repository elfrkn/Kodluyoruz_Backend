import java.util.Scanner;

public class gelismisHesapMakinesi {

    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam:" +result);
        return result;
    }

    static int cikarma(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma:"+result);
        return result;

    }

    static int carpma(int a,int b){
        int result=a*b;
        System.out.println("Çarpım:" +result);
        return result;
    }

    static int bolme(int a,int b){
        if(b==0){
            System.out.println("İkinci sayı 0'dan farklı olmalı");
        }
        int result=a/b;
        System.out.println("Bölüm:"+result);
        return result;
    }

    static int usluSayi(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Üslü sayı sonucu:"+result);
        return result;
    }

    static int mod(int a,int b){
        int result=a % b;
        System.out.println("Mod:"+result);
        return result;
    }

    static void dikdortgen(int a,int b){

        System.out.println("Dikdörtgenin çevresi:"+(2 * (a +b)) + "\n Dikdörtgenin alanı:" + a*b);


    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int select;
        String menu="1-Toplama İşlemi:\n"
                +"2-Çıkarma İşlemi:\n"
                +"3-Çarpma İşlemi:\n"
                +"4-Bölme İşlemi\n"
                +"5-Üslü Sayı Hesaplama:\n"
                +"6-Mod Alma\n"
                +"7-Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0-Çıkış yap";

        while(true){


            System.out.println(menu);
            System.out.print("Bir işlem seçiniz:");
            select=in.nextInt();
            if(select==0){
                System.out.println("Güle güle");
                break;
            }
            System.out.print("1.sayıyı giriniz:");
            int a=in.nextInt();
            System.out.print("2.sayıyı giriniz:");
            int b=in.nextInt();


            switch (select){

                case 1:
                    sum(a,b);

                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    usluSayi(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dikdortgen(a,b);

                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");

            }


        }
    }
}
