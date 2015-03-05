import java.util.Scanner;

/**
 * Created by Mathias on 05.03.2015.
 */
public class TextReverser {
    static Scanner input = new Scanner(System.in);

    public static void reverse(String text){
        if (text.length() != 0){
            String temp = text;
            System.out.print(text.charAt(text.length()-1));
            reverse(text.substring(0, text.length() - 1));
        } else {
         System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Vennligst skriv inn en streng: ");
        String text = input.next();
        reverse(text);
    }
}
