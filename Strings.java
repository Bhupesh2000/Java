import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = scanner.nextLine();

        // Get no. of chars and words
        int chars = 0, words = 0;
        StringBuilder currWord = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                if(!currWord.equals("")) words ++;
                currWord.setLength(0);;
            }
            else{
                currWord.append(str.charAt(i));
                chars ++;
            }
        }
        if(!currWord.equals("")) words ++;
        System.out.println("No. of chars : " + chars);
        System.out.println("No. of words : " + words);

        // Get first and last word
        int i = 0;

        StringBuilder firstWord = new StringBuilder();
        StringBuilder lastWord = new StringBuilder();

        boolean firstCompleted = false;

        while (i < str.length()) {
            // Skip spaces
            while (i < str.length() && str.charAt(i) == ' ') i++;

            if (i < str.length()) {
                StringBuilder word = new StringBuilder();

                // Build the word
                while (i < str.length() && str.charAt(i) != ' ') {
                    word.append(str.charAt(i));
                    i++;
                }

                // Set first word once
                if (!firstCompleted) {
                    firstWord.setLength(0);
                    firstWord.append(word);
                    firstCompleted = true;
                }

                // Always update lastWord
                lastWord.setLength(0);
                lastWord.append(word);
            }
        }
        System.out.println("First Word : " + firstWord);
        System.out.println("Last Word : " + lastWord);

        scanner.close();
    }
}
