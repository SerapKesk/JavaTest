import jdk.jshell.Snippet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("cumle girin");
        String sentence = scanner.nextLine();

        int emptyScape = 0;

        for (int i=0; i< sentence.length(); i++){
            if(sentence.charAt(i)== ' ') {
                emptyScape++;
            }
        }
        System.out.println( " cumledeki bosluk sayisi : " + emptyScape);
    }
}