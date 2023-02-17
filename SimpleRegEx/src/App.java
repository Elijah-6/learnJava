// import java.util.Scanner;

// class ScannerRegexExample {
//     // This java class finds words in the input string and prints to the screen.
//     public static void main(String[] args) {
//         String input = "The quick brown fox jumps over the lazy dog";
//         Scanner scanner = new Scanner(input);

//         while (scanner.hasNext()) {
//             String token = scanner.findInLine("\\w+"); // regular expression pattern to match words
//             if (token != null) {
//                 System.out.println(token);
//             } else {
//                 scanner.next();
//             }
//         }

//         scanner.close();
//     }
// }

// Other ways to do so:

/*In this example, the Pattern class is used to compile the regex pattern \\w+ into a Pattern object, and the Matcher class is used to apply the Pattern object to the input string. The find() method of the Matcher class is used to find the next match, and the group() method is used to retrieve the matched text. The loop continues until there are no more matches left in the input. */


// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// class PatternMatcherExample {
//     public static void main(String[] args) {
//         String input = "The quick brown fox jumps over the lazy dog";
//         Pattern pattern = Pattern.compile("\\w+"); // regular expression pattern to match words
//         Matcher matcher = pattern.matcher(input);

//         while (matcher.find()) {
//             String match = matcher.group();
//             System.out.println(match);
//         }
//     }
// }



// Again

/*n this example, the split() method of the String class is used to split the input string into an array of words, using the regular expression pattern \\s+ to match one or more whitespace characters as the delimiter. */
class StringRegexExample {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String[] words = input.split("\\s+"); // regular expression pattern to split the input string into words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
