import java.util.Scanner;

public class BigAndSmallNumber {
    public static void main(String[] args) {

        int bigNumber=0;
        int smallNumber=0;

        Scanner input=new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz:");
        int n= input.nextInt();
        for(int i=1; i<=n; i++){

            System.out.print( i +". sayıyı giriniz:");
            int sayi= input.nextInt();

            if(i==1){
                 bigNumber=sayi;
                 smallNumber=sayi;
            }


               if(sayi>bigNumber)   bigNumber=sayi;
                 
               if(sayi<smallNumber)  smallNumber=sayi;
                   


        }
            System.out.println("Girilen sayılardan en büyüğü:" +bigNumber);
            System.out.println("Girilen sayılardan en küçüğü:" +smallNumber);
        }


      }


