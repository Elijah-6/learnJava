import java.util.Scanner;

class ScannerRegexExample {
    // This java class finds words in the input string and prints to the screen.
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        Scanner scanner = new Scanner(input);

        while (scanner.hasNext()) {
            String token = scanner.findInLine("\\w+"); // regular expression pattern to match words
            if (token != null) {
                System.out.println(token);
            } else {
                scanner.next();
            }
        }

        scanner.close();
    }
}
