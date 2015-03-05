import java.util.Scanner;

public class TextReverser {
    static Scanner input = new Scanner(System.in);
    private static int counter;

    public static void reverse(String text){

        if (text.length() != 0){
            String temp = text;
            System.out.print(text.charAt(text.length()-1));
            reverse(text.substring(0, text.length() - 1));
        } else {
         System.out.println();
        }
    }

    public static void countSymbols(String text) {
            for(int i = 0; i < text.length(); i++){
                if(text.charAt(i) != ' '){
                counter++;
                }
            }
        }



    public static void main(String[] args){
        System.out.println("Vennligst skriv inn en streng: ");
            String text = input.nextLine();
            reverse(text);
            countSymbols(text);

        System.out.println("Number of symbols: " + counter);
    }

}
