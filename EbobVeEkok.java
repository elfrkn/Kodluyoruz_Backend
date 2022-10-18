import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        int sayi=0;
        int ebob=1;
        int i=0;
        Scanner input=new Scanner(System.in);
        System.out.print("N1 sayısını giriniz:");
        int n1= input.nextInt();
        System.out.print("N2 sayısını giriniz:");
        int n2= input.nextInt();
        if(n1<n2){
            sayi=n1;
        }else if(n2<n1){
            sayi=n2;
        }

        while(i<=sayi){
            i++;
            if(n1%i==0 && n2%i==0){
                ebob=i;

            }
        }



        System.out.println("Girilen sayıların Ebob değeri:"+ebob);
        System.out.println("Girilen sayıların Ekok değeri:"+ (n1*n2) / ebob);

    }
}
