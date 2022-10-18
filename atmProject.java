
import java.util.Scanner;

public class AtmSwitch{
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select,price;
        while(right>0){
            System.out.print("Kullanıcı Adınız:");
            userName= input.nextLine();
            System.out.print("Şifrenizi giriniz:");
            password= input.nextLine();
            if(userName.equals("admin") && password.equals("1234")){
                System.out.println("Merhaba,X bankasına hoşgeldiniz.");
                do {

                    System.out.println("1-Para yatırma\n"+
                            "2-Para çekme\n"+
                            "3-Bakiye sorgula\n"+
                            "4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");

                    select= input.nextInt();
                    switch(select){
                        case 1:
                        System.out.println("Para miktarını giriniz:");
                        price= input.nextInt();
                        balance +=price;
                        break;
                        case 2:
                        System.out.println("Para miktarını giriniz:");
                        price= input.nextInt();
                        if( price >balance){
                            System.out.println("Bakiye yetersiz!");
                        }else{
                            balance -=price;
                        }
                        break;
                        case 3:
                        System.out.println("Bakiyeniz:" +balance);
                        break;
                    }


                }while(select !=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı ve şifre girdiniz.Tekrar deneyiniz");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.Banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız:" + right );
                }

            }

        }
    }
}
