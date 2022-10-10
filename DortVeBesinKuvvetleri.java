import java.util.Scanner;

public class İkininKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz:");
        n=input.nextInt();
        for(int i=1; i<=n; i*=4){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for(int j=1; j<=n; j*=5){

                System.out.print(j+" ");
            }

    }
}
