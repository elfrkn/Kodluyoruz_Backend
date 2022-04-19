import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        String username,password,newpassword;
        int select;
        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        username=input.nextLine();
        System.out.println("Şifrenizi giriniz:");
        password=input.nextLine();

        if(username.equals("elfrkn") && password.equals("1234")){
            System.out.println("Giriş yaptınız");
        }else {
            System.out.println("Şifreniz yanlış.Şifrenizi sıfırlamak istermisiniz? 1-evet\n2-hayır. ");
            select=input.nextInt();

         if(select==1){
             Scanner inp=new Scanner(System.in);
             System.out.println("Yeni şifreyi girniz:");
             newpassword= inp.nextLine();
             if(newpassword.equals("1234")){
                 System.out.println("Yeni şifre eski şifreyle aynı olamaz.");

             }else{
                 System.out.println("Şifreniz başarıyla oluşturuldu.");
             }

         }
    }

}

}
