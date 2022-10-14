import java.util.Scanner;

public class basamakSayiToplam {
    public static void main(String[] args) {
        int sayi,total=0;
        int basamak;
        Scanner in=new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        sayi=in.nextInt();

        while(sayi !=0){
            basamak=sayi%10;
            total +=basamak;
            sayi /=10;
        }

        System.out.println("Girilen sayının basamak toplamı:" + total);

    }
}
