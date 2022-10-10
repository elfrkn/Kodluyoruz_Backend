import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        int n,r;
        int total1=1;
        int total2=1;
        int total3=0;
        int cikarma=1;

        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen kümenin eleman sayısını giriniz:");
        n=inp.nextInt();
        System.out.print("Lütfen farklı grupların sayısını giriniz:");
        r=inp.nextInt();

        for(int i=1; i<=n; i++){
            total1*=i;
        }

        for (int j=1; j<=r; j++){
            total2*=j;
        }

        int C=n-r;
        for(int k=1; k<=C; k++){
            cikarma *=k;

        }

        total3 = total1 / (total2 * cikarma);


        System.out.println("Kombinasyon Formülü Sonucu:" +total3);


    }
}
