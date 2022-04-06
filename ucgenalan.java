import java.util.Scanner;

public class ucgenalan {
    public static void main(String[] args){

        int a, b, c ,cevre,u;
        double alan;
        Scanner input=new Scanner(System.in);

        System.out.println("1.kenar uzunluğunu giriniz");
        a=input.nextInt();

        System.out.println("2.kenar uzunluğunu giriniz:");
        b= input.nextInt();

        System.out.println("3.kenar uzunluğunu giriniz:");
        c= input.nextInt();

        cevre=a+b+c;
        u=cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));



        System.out.println("Uçgenin çevresi:" +cevre);
        System.out.println("Üçgenin alanı:" +alan);
        

    }



}
