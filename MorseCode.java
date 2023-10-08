import java.util.Scanner;

public class MorseCode {
    String[] morseCode = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
        "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MorseCode morseCodeConverter = new MorseCode();

        while (true) {
            System.out.println("Type something here and I will convert it to morse code, or type 'exit' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                String morseOutput = morseCodeConverter.translateToMorseCode(input);
                System.out.println("Morse Code is: " + morseOutput);
            }
        }
        scanner.close();
    }

    public String translateToMorseCode(String input) {
        input = input.toLowerCase();
        String[] words = input.split("\\s+");
        StringBuilder morseResult = new StringBuilder();

        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (Character.isLetter(letter)) {
                    int index = letter - 'a';
                    if (index >= 0 && index < letters.length) {
                        morseResult.append(morseCode[index]).append(" ");
                    }
                }
            }
            morseResult.append("/"); // Add space between words
        }

        return morseResult.toString();
    }
}
