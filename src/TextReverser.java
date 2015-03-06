import java.util.Scanner;

public class TextReverser {
    static Scanner input = new Scanner(System.in);
    private static int counter;

    public static void reverse(String text, int last){

        if (last == 0) {
            System.out.println(text.charAt(last));
        } else {
            System.out.print(text.charAt(last));
            reverse(text, last-1);
        }
    }


    public static void reverseInitiate(String text){
        int last = text.length()-1;
        reverse(text, last);
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
            reverseInitiate(text);
            countSymbols(text);

        System.out.println("Number of symbols: " + counter);
    }

}
