
import java.io.*;
// import java.util.*;
public class App {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, Elijah");// This is my name
        String fisrtName;// Variable to hold first name of  the user
        String lastName;// variable to hold last name
        String middle;// variable to hold middle initial
        int age;

        try (/*instanciating a Buffered reader object to accept inputs
                 * This accepts results from InputStreamReader's System.in method'
                 */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            // Prompt user to enter first name
            System.out.println("Please input your first name: ");
            //store the input in a variable 
            fisrtName = in.readLine();
            //prompt for last name
            System.out.println("Last name: ");
            // store the input in a variable
            lastName = in.readLine();
            // prompt for middle initial
            System.out.println("Middle initial");
            // store middle initial
            middle = in.readLine();

            // prompt for age 
            System.out.println(" How old are you?");
            
            //Reading and casting to integer value
            age = Integer.parseInt(in.readLine());
            
        }

        // Print the users name to the screen
        System.out.println("Your name is " + fisrtName + " " + middle + " " + lastName);
        System.out.println("and you are "+ age + " years old.");

        
    }



// This is a method to add two numbers:
//     public static int addNums(int num1, int num2) {
//         int sum = num1 + num2;
//         return (sum);
// }
}
