import java.util.Scanner;

class REVERSE {
    public static void main(String[] args) {
        //Taking user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        //putting the input in str
        String str = scanner.nextLine();
        //Calling the reverseWord function to reverse the input string
        String reversedWord = reverseWord(str);

        // Displaying the reversed word
        System.out.println("Reversed word: " + reversedWord);
        // Closing the scanner
        scanner.close();
    }
 // Function to reverse a given string
    private static String reverseWord(String str) {
        // Initializing an empty string to store the reversed string
        String reversedStr = "";
        for (int i = 0; i < str.length(); i++) {
            // Extracting each character
            char ch = str.charAt(i);
            //putting them in the reversedStr
            reversedStr = ch + reversedStr;
        }
        return reversedStr;
    }
}

