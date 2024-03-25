import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        //Bir kullanıcıdan alınan bir kelimenin palindrom olup olmadığını kontrol eden bir Java programı yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime giriniz: ");
        String word= scanner.nextLine();
        String palindrom = "";

        for (int i = word.length()-1; i>=0; i--){
            palindrom +=word.charAt(i);
        }
        if (word == palindrom) {
            System.out.println(word + " palindromedir");
        }
        else {
            System.out.println(word + " palindrom degildir");

        }
    }
}
