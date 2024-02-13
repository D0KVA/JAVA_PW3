import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = "палиндром";
        String b = "не палиндром";

        do {
            System.out.println("Введите слово: ");

            String slovo = sc.nextLine().replace(" ", "").toLowerCase();

            char[] palindrom = new char[slovo.length()];

            for (int i = 0; i < slovo.length(); i++) {
                palindrom[i] = slovo.charAt(i);
            }

            char[] palindrom1 = new char[slovo.length()];

            for (int i = 0; i < slovo.length(); i++) {
                palindrom1[i] = palindrom[palindrom.length- 1 - i];
            }

            if (Arrays.equals(palindrom, palindrom1)){
                System.out.println("Ваше слово " + a);
            }

            else{
                System.out.println("Ваше слово " + b);
                break;
            }

        } while(true);

    }

}