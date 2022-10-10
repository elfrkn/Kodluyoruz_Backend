import java.util.Scanner;

public class tekSayilarinToplamı {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz:");
            n= scan.nextInt();
            if( n % 4==0 || n % 2==0){
                total +=n;


            }
        }while(n %2 ==0);

        System.out.println("Toplam : " +total);



    }
}
