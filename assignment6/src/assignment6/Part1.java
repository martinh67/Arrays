package assignment6;

// import the scanner library
import java.util.Scanner;

public class Part1 {

	// the main method
    public static void main(String[] args) {

    		// declare variables
            int[] myArray = new int[101];
            
            Scanner input = new Scanner(System.in);
            
            // give information regarding the program
			System.out.println("\nProgram to obtain and order 5 unique numbers between 10 and 100\n");

            // for loop in order to obtain 5 valid numbers
            for (int i = 0; i < 5; i++) {
            	
                // while the input is valid  
                while (true) {
                	
                	// take the next number
                	System.out.print("Input Number " + (i + 1) + ": ");
                    
                	// try to process the number
                    try {
                    	
                    		// declare number as the next input number from the user
                    		int number = input.nextInt();
                    		
                    		// if the number is greater than 10
                    		if (number >= 10) {
                    			
                    			// if the number is a duplicate
                    			if (myArray[number] > 0) {
                    				
                    				// print error message
                    				System.out.println("\nDuplicate number for Number " + 
                    				(i + 1) + " try again.\n");
                    				
                    			}
                    			
                    			// if the number is valid
                    			if (myArray[number] == 0) {
                    				
                    				// add number to the array
                    				myArray[number]++;
                    				
                    				// break from while loop
                    				break;
                    				
                    			}
                    		
                    		// if the number was less than 10
                    		} else {
                    			
                    			// print error message
                            	System.out.println("\nInput must be 10 or greater for Number " + 
                                    	(i + 1) + " try again.\n");
                    		}
                    		
                    
                    // catch any symbols or characters
                    } catch (java.util.InputMismatchException e) {
                    	
                    	// print error message
                    	System.out.println("\nInput must be an integer for Number " + 
                    	(i + 1) + " try again.\n");
                    	
                    	// get the next input
                    	input.nextLine();
                    	
                    }  
                    
                    // catch any numbers greater than 100
                    catch(ArrayIndexOutOfBoundsException e) {  
                    	
                    	// print error message
                    	System.out.println("\nThe number " + (i + 1) + 
                    			" is out of bounds, try again\n");
                    	
                    	// get the next input
                    	input.nextLine();
                     
                    }    

                }
                    
            }

            // print the title
            System.out.print("\nUnique Numbers: ");

            // for all of the numbers in the array
            for (int i = 0; i < myArray.length; i++) {
            	
            	// if the array element is greater than 0
                if (myArray[i] > 0) {
                	
                	// print the number
                    System.out.print(i + " ");
                }
            }

            // print a space
            System.out.println();
        }
    }

