import java.util.Scanner;
public class recursiveUsAlma {

    static int usAlma(int taban,int  us){
        if(taban==0){
            return 1;
        }

         int result=(int) Math.pow(taban,us);
         return result;

        }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Lütfen taban değerini giriniz:");
        int taban=n.nextInt();
        System.out.print("Lütfen üs değerini giriniz:");
         int us=n.nextInt();

        System.out.println("sonuç:"+usAlma(taban,us));
    }
}
