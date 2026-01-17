import java.util.Scanner;

/*
Questions:

(7) Vowel or consonant
(8) Uppercase or lowercase
(18) Alphabet / Digit / Special

 */
public class conditionalLogicC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        // To check if vowel or consonant
        if(Character.isAlphabetic(ch)){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("The character is not an alphabet.");
        }

        // To check if uppercase or lowercase and convert
        if(Character.isUpperCase(ch)) {
            System.out.println("The character is uppercase.");
            System.out.println("Converted to lowercase: " + Character.toLowerCase(ch));
        } else if(Character.isLowerCase(ch)) {
            System.out.println("The character is lowercase.");
            System.out.println("Converted to uppercase: " + Character.toUpperCase(ch));
        } else {
            System.out.println("The character is neither uppercase nor lowercase.");
        }

        //to check if alphabet, digit or special character
        if(Character.isAlphabetic(ch)) {
            System.out.println("The character is an alphabet.");
        } else if(Character.isDigit(ch)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }    

        sc.close();
    }
}
