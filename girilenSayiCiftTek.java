import java.util.Scanner;

public class GirilenSayiCiftTek {
    public static void main(String[] args) {
        int k;
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        k=inp.nextInt();

        for(int i=1; i<=k; i++){
            if(i % 3==0 && i % 4==0){
            System.out.println(i);
        }


    }
    }
}
