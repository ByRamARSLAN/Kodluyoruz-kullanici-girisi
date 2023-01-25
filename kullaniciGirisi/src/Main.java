import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, passWord, yes = "y";

        boolean durum = true;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        passWord = input.nextLine();

        while (durum) {
            if (userName.equals("By.Ram") && passWord.equals("AliVeliDeli123")) {
                System.out.println("Giriş başarılı.");
            } else if (!userName.equals("By.Ram")) {
                System.out.println("Kullanıcı adı hatalı");
            } else if (!passWord.equals("AliVeliDeli123")) {
                System.out.println("Şifreniz hatalı");
                System.out.println("Şifrenizi sıfırlamak istiyor musunuz?(y/n): ");

                if (Objects.equals(input.nextLine(), "y")) {
                    System.out.print("Yeni şifre : ");
                    passWord = input.nextLine();
                    System.out.println("Şifreniz değiştiridi");
                    break;
                }
            }
        }
    }
}