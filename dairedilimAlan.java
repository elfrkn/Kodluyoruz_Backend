package giris;

import java.util.Scanner;

public class dairedilimAlan {
    public static void main(String[]args){

        int yaricap;
        double pi=3.14 ,merkezaci ,alan;

        Scanner input=new Scanner(System.in);
        System.out.println("Yarıçapı giriniz:");
        yaricap= input.nextInt();

        System.out.println("Merkez açının ölçüsünü giriniz:");
        merkezaci= input.nextDouble();

        alan=(pi * (yaricap*yaricap) * merkezaci) / 360;
        System.out.println("Daire diliminin alanı:" +alan);



    }

}
