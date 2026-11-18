package com.mycompany.gymmembership;

// ** Update comment below **

/**
 * Program: GymMembership Class
 * @author Student
 * Date: 
 */

import java.util.Scanner;

public class GymMembership {

    // ** Insert comment explaining fields here **
    // ** Insert relevant code here (member name and remaining credits fields) **


    // ----- Constructor -----
    // ** Insert comment explaining constructor **
    // ** Insert relevant code here **


    // ----- Methods -----

    // Top up class credits
    // ** Insert additional explanatory comment here (tag with // AI-assisted: if AI helped with validation) **
    public void topUpCredits(int amount) {
        // ** Insert relevant code here (include check so zero or negative credits cannot be added) **
    }

    // Book fitness classes if sufficient credits are available
    // ** Insert additional explanatory comment here **
    public void bookClasses(int amount) {
        // ** Insert relevant code here **

    }

    // Display current number of remaining credits
    // ** Insert method header here **
        System.out.println("Current credits for \"" + memberName + "\": " + remainingCredits);
    // ** Don't forget closing brace **


    // ----- Main Program -----
    public static void main(String[] args) {

        // Declare and create a Scanner object
        // ** Insert relevant code here **

        // Create a GymMembership object
        // ** Insert relevant code here **

        // User's choice for the menu
        int choice;

        // Display menu and process user's choice
        // ** Start repeated block of code - insert relevant code here **

            // Display menu
            System.out.println("\n===== GYM PASS MENU =====");
            // ** Insert remaining menu options (1 to 4) here **


            // Get user's choice
            System.out.print("Enter your choice: ");
            // (Optional: Use AI to check how to validate non-numeric input safely)
            choice = input.nextInt();

            // Process menu choice
            switch (choice) {
                case 1:
                    System.out.print("Enter credits to add: ");
                    int addAmount = input.nextInt();
                    memberPass.topUpCredits(addAmount);
                    break;

                case 2:
                    System.out.print("Enter number of classes to book: ");
                    // ** Insert relevant code here **
                    break;

                case 3:
                    memberPass.checkCredits();
                    break;

                case 4:
                    // Exit program
                    // ** Insert relevant code here **
                    break;

                default:
                    // Invalid choice
                    // ** Insert relevant code here **
            }

        // ** End repeated block of code - insert relevant code here **

        input.close();
    } // end main method

} // end class
