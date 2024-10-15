import java.util.Random;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) throws Exception {   //Start of main
        
        //  Importing important functions. First line is added before the public class, second is added to the main.
        
        //  *************************
        //  GENERATING RANDOM NUMBERS
        //  *************************

        //  import java.util.Random;                            // This goes before the public class.
        //  Random random = new Random();                       // This goes in the main.

        //  Example on generating and printing the random numbers

        //  Random random = new Random();

        //  This sets the range between 0-4
        //  int randomNumber = random.nextInt(5);

        //  If you want to print out random numbers between 1-5, you add "+1" within the brackets. "System.out.println(randomNumber + 1);"
        //  System.out.println(randomNumber);
        
        //  If you want to print more than 1 number you need to use a counter.

        //  for (int i = 0 ; i < 5 ; i++)                       // This is a basic setup for "for loop/counter"
        //     {
        //       int randomNumber = random.nextInt(5);          // It is important that the random generation is done within the loop to get a new random number every print.
        //       System.out.println(randomNumber + 1);          // Here is added +1 to the result so the range is within 1-5.
        //     }



        //  *************************
        //          USER INPUT
        //  *************************  

        //  import java.util.Scanner;                           // This goes before the public class.
        //  Scanner in = new Scanner(System.in);                // This goes in the main.

        //  Examples.

        //  This is for a string input, AKA words.
        //  Scanner in = new Scanner(System.in);
        //  String input = "";

        //  System.out.println("Write something and I will print it.");
        //  input = in.nextLine();

        //  System.out.println("You typed " + input);

        //  This for a int input, AKA numbers.
        //  Scanner in = new Scanner(System.in);
        //  int input = 0;

        //  System.out.println("Give me a number and I will add 4 to it.");
        //  input = in.nextInt();

        //  System.out.println(input + 4);

        //  Sometimes numbers can be other than whole numbers, then we use double for example 5.5
        //  Scanner in = new Scanner(System.in);
        //  double input = 0;

        //  System.out.println("Give me a number and I will add 4.5 to it.");
        //  input = in.nextDouble();                                                // When giving an input that isn't a whole number, use "." instead of ","

        //  System.out.println(input + 4.5);

        //  *************************
        //          NOTICE
        //  *************************
        //  Often inputs are string types, so it is better to not use "in.nextInt or in.nextDouble"
        //  Scanner in = new Scanner(System.in);
        //  String input = "";
        //  double number = 0;

        //  System.out.println("Give me a number and I'll add 4.5 to it.");
        //  input = in.nextLine();

        //  Here is the how you can parse to integer and to double.
        //  number = Integer.parseInt(input);
        //  number = Double.parseDouble(input);

        //  System.out.println(number + 4.5);

    } // End of main
}
