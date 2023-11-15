package assignment6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Part2 {

	// the main method
    public static void main(String[] args) {
    	
    	// declare collection
        Set<Integer> myCollection = new HashSet<Integer>();
        
        // declare the scanner object
        Scanner input = new Scanner(System.in);
        
        // give information regarding the program
		System.out.println("\nProgram to obtain 5 unique numbers between 10 and 100\n");

        // for loop in order to obtain 5 valid numbers
        for (int i = 0; i < 5; i++) {
        	
            // while the input is being validated            
            while (true) {
            	
            	// take input from 
                System.out.print("Input Number " + (i + 1) + ": ");
                
                // try to process the number
                try { 
                
                	// declare number as the next input number from the user
	                int number = input.nextInt();
	                
	                // if the number is already within the set
	                if (myCollection.contains(number)) {
	                	
	    				// print error message
	    				System.out.println("\nDuplicate number for Number " + 
	    				(i + 1) + " try again.\n");
	                    
	    			// if the number is out of bounds	
	                } else if (number < 10 || number > 100) {
	                	
	                	// print error message
	                    System.out.println("\nThe number should be 10 to 100, please try again.\n");
	                    
	                    
	                // if the number is valid  
	                } else {
	                	
	                	// add the number to the hash set
	                    myCollection.add(number);
	                    
	                    // break from the loop
	                    break;
	                }
                
	             // catch any symbols or characters
                } catch (java.util.InputMismatchException e) {
                	
                	// print error message
                	System.out.println("\nInput must be an integer for Number " + 
                	(i + 1) + " try again.\n");
                	
                	// get the next input
                	input.nextLine();
                	
                } 
                
            }
        }

        // print the heading
        System.out.print("\nUnique Numbers: ");

        // create iterator object
        Iterator<Integer> iterator = myCollection.iterator();
        
        // while the iterator has a next element
        while (iterator.hasNext()) {
        	
        	// print the element
            System.out.print(iterator.next() + " ");
        }

        // print a space
        System.out.println();
        
    }
}

