import java.util.Scanner;

public class vucutkitlehesaplama {
    public static void main(String[]args){
        double boy,kilo,vki;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        boy= input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz:");
        kilo= input.nextDouble();

        vki=kilo / (boy *boy);

        System.out.println("Vücut kitle indeksiniz:" +vki);



    }
}
