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

        //  Scanner in = new Scanner(System.in);

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



        //  *************************
        //    EXAMPLES START HERE
        //  *************************



        //  *************************
        //          LOOPS
        //  *************************


        //  This loops example is about how to print stars, by addind 1 more for each row. 
        //  Scanner in = new Scanner(System.in);

        //  System.out.println("How many rows?");
        //  int rows = in.nextInt();

        //  for (int i = 1; i <= rows; i++)                             //How many rows are printed
        //     {   
        //                                                                  //for (int space = 1; space <= (rows - i); space++)   //How many spaces there are before printing a * and removing a space each row printed 
        //                                                                  //{
        //  When these 4 lines are added the stars will be reversed        //System.out.print(" ");
        //                                                                  //}
        //         for (int stars = 1; stars <= i; stars++)            //How many stars are printed, and added for each row
        //         {
        //         System.out.print("*");                              //Using just print so there is no line change
        //         }                        
        //         System.out.println();                               //Doing a line change after desired amount of stars are printed.
        //         }
        
        


        //  This example is for guessing a name

        //  Scanner in = new Scanner(System.in);
        //  String name = "";
        //  String correct = "Pekka";
        //  int guess = 0;
        //  System.out.println("Guess my name (type stop to exit)");
            
        //  while(true)
        //  {
        //     name = in.nextLine();
        //     guess++;
        
        //  if (name.equalsIgnoreCase(correct))
        //         {
        //         System.out.println("Congratulations!");
        //         System.out.println("You guessed " + guess + " times.");
        //         break;
        //         }
        //  else if (name.equalsIgnoreCase("stop"))    
        //         {
        //         guess--;
        //         System.out.println("You guessed " + guess + " times.");
        //         break;
        //         }
        //  else
        //     {
        //     System.out.println("Guess my name (type stop to exit)");
        //     }
        //  }




        //  *************************
        //          ARRAYS
        //  *************************

        //  Generating and storing 7 different random numbers into an array.
        //  int[] rolls = new int[7];                                           // Creates an array that can hold 7 integers.
        //  Random numbers = new Random();                                      // Initializes the random number generator.
        
        //  for(int current = 0 ; current < rolls.length ; current++)           // Loops through each position in the array (from index 0 to 6).
        //     {
        //     boolean isUnique;                                               // Boolean flag to track whether the generated number is unique.
        //     do {                                                            // Start of the loop that generates a new number and checks its uniqueness.
        //         int newNumber = numbers.nextInt(35) +1;                     // Generates a random number between 1 and 35 (nextInt(35) returns a number from 0-34, adding 1 shifts the range to 1-35).
        //         isUnique = true;                                            // Assumes the number is unique initially. 

        //         for (int previous = 0 ; previous < current ; previous++)    // Loop to check if the new number already exists in the array (up to the current index).
        //             {
        //                 if (rolls[previous] == newNumber)                   // If the new number matches any number already in the array...
        //                 {
        //                 isUnique = false;                                   // ...set the flag to false and break the loop.
        //                 break;
        //                 }
        //             }

        //         if (isUnique)                                               // If no match was found (i.e., the number is unique)...
        //             {
        //             rolls[current] = newNumber;                             // ...store the number in the current position of the array.
        //             }
        //         } while (!isUnique);                                        // Repeat the process until a unique number is generated.
        //     }
        //  for (int current = 0 ; current < rolls.length ; current++)          // Loop to print all the values in the 'rolls' array.
        //     {
        //         System.out.println(rolls[current]);                         // Prints each value in the array one by one.
        //     }




        //  Generating random numbers and storing to array, also handling the summing of the numbers.
        //  for (int i = 0 ; i < (rolls.length) ; i++)
        //     {
        //     rolls[i] = number.nextInt(6) +1;
        //     sum += rolls[i];
        //     }
        
        //     //Printing the rolls    
        //  for (int i = 0 ; i < rolls.length ; i++)
        //     {
        //         System.out.println(rolls[i]);
        //     }
        
        //     //Displaying the sum of the rolls
        //     System.out.println("The sum of rolls is " + sum);

        //     //Sorting the array from lowest to highest, and pulling the last array which has the highest numnber.
        //     Arrays.sort(rolls);
        //     System.out.println("The highest roll is " + rolls[rolls.length - 1]);



        //  *************************
        //     2 DIMENSIONAL ARRAY
        //  *************************


        //  *************************
        //          NOTICE
        //  *************************
        //  This example contains methods, thats why it has "End of main" comment in it.
        
        //         Scanner in = new Scanner(System.in);
        //         String[][] grid = new String[5][5];     //Make a grid that is 5 by 5

        //         //  Fill the grid with "O"s
        //         for (int i = 0 ; i < 5 ; i++)
        //             {
        //             for (int j = 0 ; j < 5 ; j++)
        //                 {
        //                     grid[i][j] = "O";
        //                 }
        //             }
        
        //         // Loop it until user inputs "0"
        //         while(true)
        //         {
        //         System.out.println("Current Grid");
        //         // Calls for the printGrid method
        //         printGrid(grid);

        //         System.out.println("Enter a row (1-5):");
        //         int row = in.nextInt();
        //         if (row == 0)
        //             {
        //                 System.out.println("Game Over!");
        //                 break;
        //             }

        //         System.out.println("Enter a column (1-5)");
        //         int column = in.nextInt();
        //         if (column == 0)
        //             {
        //                 System.out.println("Game Over!");
        //                 break; 
        //             }
        
        //         // Adjust the user input so it works with indexing "so user types 1 and it reads it as index 0"
        //         row -= 1;
        //         column -=1;
        
        //         // Calls for the shoot method
        //         shoot(row, column, grid);

        //         System.out.println("Current Grid");
        //         printGrid(grid);
        //         }
        //         in.close();
        //     }    // End of main

        //     // Method to print the current state of the grid.
        //     public static void printGrid(String[][] grid)
        //     {
        //         System.out.print("  ");
        //         for (int j = 0 ; j < 5 ; j++)
        //             {
        //             System.out.print((j + 1) + " ");
        //             }
        //             System.out.println();


        //         for (int i = 0 ; i < 5 ; i++)
        //             {
        //             System.out.print((i + 1) + " ");
        //             for (int j = 0 ; j < 5 ; j++)
        //                 {
        //                 System.out.print(grid[i][j] + " ");
        //                 }
        //                 System.out.println(); // Move to the next row 
        //             }
        //     } // End of grid method

        //     // Method to handle the shooting logic.
        //     public static void shoot(int row, int column, String[][] grid)
        //     {
        //         if (row >= 0 && row < 5 && column >= 0 && column < 5)
        //             {
        //                 grid[row][column] = "X";    // Mark the shot position with "X"
        //                 System.out.println("You shot at (" + row + ", " + column + ")");
        //             }
        //         else
        //             {
        //                 System.out.println("Invalid coordinates!");
        //             }
        //     } // End of shoot method
        //  }

    }   // End of main for this whole app.


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
