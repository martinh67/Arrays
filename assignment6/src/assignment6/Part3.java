package assignment6;


import java.io.File;
import java.util.Scanner;


public class Part3 {

	// the main method
    public static void main(String[] args) throws Exception {
    	
        // set the initial totals to 0
        int characterTotal = 0;
        int lineTotal = 0;
    	
    	// give information regarding the program
    	System.out.println("Program to count the total number of lines and characters in a file\n");
    	
    	// declare scanner object
        Scanner input = new Scanner(System.in);
       
        // ask for a filename
        System.out.print("Enter filename, inluding path and extension: ");
        
        // set the file name to the user input
        String filename = input.nextLine();
        
        // declare file object
        File file = new File(filename);
        
        // if the file does not exist
        if (!file.exists()) {
        	
        	// give error message
            System.out.println("\nThe file could not be found, exiting...");
            
            // close the scanner
            input.close();
            
            // exit the program
            return;
        }
        
        // read the valid file
        Scanner fileIn = new Scanner(file);
        
        // while the file has data
        while (fileIn.hasNextLine()) {
        	
        	// process the next line of the file
            String line = fileIn.nextLine();
            
            // increment the line counter
            lineTotal++;
            
            // increment the character counter using the length of the line
            characterTotal += line.length();
        }
        
        // close the file
        fileIn.close();
        
        // print the results
        System.out.println("\nTotal Lines: " + lineTotal + "\nTotal Characters: " + characterTotal);
        
        // close the scanner
        input.close();
        
    }
}

