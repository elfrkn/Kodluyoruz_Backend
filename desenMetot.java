import java.util.Scanner;

public class desenMetot {

            static void desen(int sayi){
            int caunt=0;

               while(sayi>0){

                   System.out.print(sayi+" ");
                   sayi-=5;
                   caunt++;

               }


            for(int i=1; i<= caunt+1; i++){
                    System.out.print(" " +sayi+" ");
                    sayi+=5;
                }



}


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("N sayısı:");
        int sayi=in.nextInt();
        desen(sayi);



    }
}
