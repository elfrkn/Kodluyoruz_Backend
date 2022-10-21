import java.util.Scanner;

public class recursiveAsalNumber {

    static boolean asalMi(int sayi){
        int sayac=0;
        for(int i=2; i<sayi; i++){

            if(sayi % i==0){
              sayac ++;
            }
        }
        if(sayac == 0){
            System.out.println(sayi + " " + " sayısı ASAL sayıdır.");
            return true;

        }else {
            System.out.println(sayi+ " " +"sayısı Asal sayı DEĞİLDİR.");
            return false;
        }


    }



    public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi=in.nextInt();
        asalMi(sayi);



    }

}
