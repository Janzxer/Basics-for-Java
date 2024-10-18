import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
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



        //  *************************
        //          ARRAYS
        //  *************************
        //  To use Arrays.sort(); you need to import java.util.Arrays;

        //  Arrays is good to use when you know how many values there will be, like if there will be  5, 10, 15 etc. 
        
        //  int[] points;
        //  points = new int[5];

        //  points[0] = 5;
        //  points[1] = 10;
        //  points[2] = 3;
        //  points[3] = 2;
        //  points[4] = 0;

        //  Arrays.sort(points);
        //  for (int i = 0 ; i < points.length ; i++)
        //      {
        //          System.out.println(points[i]);
        //      }
            
        //  System.out.println(Arrays.stream(points).sum());        //With this you can sum the arrays integer values.


        //  *************************
        //          ARRAYLIST
        //  *************************

        //  You need to import java.util.ArrayList; to use arraylists.


        //  ArrayList<String> names = new ArrayList<String>();

        //  // Heres how you add to the list.
        //  names.add("Mike");
        //  names.add("Pia");
        //  names.add("Katja");

        //  System.out.println(names.get(0));       // This will print "Mike"

        //  for (int i = 0 ; i < names.size() ; i++)
        //      {
        //          System.out.println(names.get(i));
        //      }
            
        //  Heres how you can remove from the list.
        //  names.remove(1);        // This will remove "Pia" from the list.


        //  Example with a guessing game.
            
        //  Scanner in = new Scanner(System.in);

        //  int rightNumber = 3;
        //  String input;

        //  ArrayList<Integer> guesses = new ArrayList<Integer>();

        //  do
        //  {
        //      System.out.println("Guess the right number between 1-5");
        //      System.out.println("Type 0, if you want to quit");
        //      input = in.nextLine();

        //      if (Integer.parseInt(input) != 0)       // This way when user types 0, it won't be counted as a guess.
        //         {
        //             guesses.add(Integer.parseInt(input));
        //         }

        //      if (Integer.parseInt(input) == rightNumber)
        //         {
        //             System.out.println("You guessed right!");
        //             break;
        //         }

        //  } while (Integer.parseInt(input) != 0);     // This loops until user inputs 0 as an aswer. The break is applied within the loop if the user submits a correct answer.

        //  System.out.println("Your guesses");
        //  for (int i = 0 ; i < guesses.size() ; i++)
        //      {
        //         System.out.println(guesses.get(i));
        //      }



        //  Otherway to not "count" the 0

        //  if (Integer.parseInt(input) == 0)
        //      {
        //         guesses.remove(guesses.size() -1);
        //      }




        //  *************************
        //       ERROR HANDLING
        //  *************************

        // Scanner in = new Scanner(System.in);

        //  int number = 0;
        //  boolean numberOK = false;
        //  do  {
        //     System.out.println("Please give me a number");
        //         try
        //             {
        //             number = Integer.parseInt(in.nextLine());        number = Integer.parseInt(in.nextLine()); May cause an error, thats why it's in the "try" section.
        //             numberOK = true;                                 Exits the loop if an integer is provided.
        //             }
        //             catch (Exception e) 
        //                 {
        //                 System.out.println("Error - you dind' write a number");
        //                 numberOK = false;                            Continues the loop if the given value isn't an integer.
        //                 }
        //      } while (numberOK == false);

        //  System.out.println("You wrote " + number);
    }   // End of main

    



        //  *************************
        //          METHODS
        //  *************************
        //  Methods are made outside of the main, and called within the main for example "fireNail;" will print out "Nail fired"
        //  Next 2 methods do not return a value, thats why there is "public static VOID".
        //     public static void fireNail() 
        //     {
        //         System.out.println("Nail fired");
        //     }



        //     //********************************
        //     //          Do this in main
        //     //********************************
        //     //  Scanner in = new Scanner(System.in);
        //     //  String inputCupSize;
        //     //  String inputStrength;
        //     //
        //     // System.out.println("Cup size?")
        //     // inputCupSize = in.nextLine();

        //     // System.out.println("Strength?")
        //     // inputStrength = in.nextLine();

        //     // makeCoffee(inputCupSize, inputStrength);
        //     //********************************
        //     public static void makeCoffee(String cupSize, String strength)
        //     {
        //         System.out.println("Here you have a coffee that is:");
        //         System.out.println("Cup size: " + cupSize);
        //         System.out.println("Strength: " + strength);
        //     }

        //     // This method will return a integer value. If it were to return a String, you would replace the "int" with "string"
        //     public static int generateRandomNumber()
        //     {
        //         Random random = new Random();
        //         int randomNumber = random.nextInt(5);
        //         return randomNumber;
        //         //return 0;   //At the start you can input "return 0;" so it doesn't give you a warning, later it will be deleted.
        //     }
        //     //********************************
        //     //          Do this in main
        //     //********************************
        //     // System.out.println("Random number is " + generateRandomNumber());
        //     //********************************

            
        //     // This method will need values, and will return a value.
        //     //********************************
        //     //          Do this in main
        //     //********************************
        //     // System.out.println(calculateArea(5,2));
        //     //********************************
        //     public static int calculateArea(int width, int length)
        //     {
        //         int area = width * length;
        //         return area;
        //     }

}
