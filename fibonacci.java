import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {


        int n,number1,number2,total;
        Scanner scr = new Scanner(System.in);

        System.out.println("Eleman sayısını giriniz: ");
        n = scr.nextInt();
        number1 = 0;
        number2 = 1;
        System.out.print(number1 + " ");
        System.out.print(number2 + " ");


        for (int i = 1; i < n; i++){
            total = number2 + number1;
            number1 = number2;
            number2 = total;
            System.out.print(" " + total);
        }
        }




}
