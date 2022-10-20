// Amariah Robinson
// 10.18.2022

import java.util.Scanner;

public class RecyclingPlasticBottles2
{
    public static void main(String[] args)
    {
        int plasticType;
        String input;
        char repeat;

        do
        {
            Scanner keyboard = new Scanner(System.in);

            // asks the user to enter the type of plastic they have
            System.out.print("Please enter the type of plastic bottle you have"
                                                + " located at the bottom of the bottle ");
            plasticType = keyboard.nextInt();

            //tells the user if their plastic is recyclable or not
            if (plasticType == 1 || plasticType == 2 || plasticType == 3 || plasticType == 4 || plasticType == 6)
            {
                System.out.println("Your bottle is safe to recycle. Please dispose in the correct bin.");
            }
            else if(plasticType <= 0 || plasticType >= 7)
            {
                System.out.println("Please enter a valid number");
            }
            else
            {
                System.out.println("Your bottle is NOT safe to recycle. Please dispose in the correct bin.");
            }
            
            keyboard.nextLine();
            // allows the user to enter multiple entries to see if all bottles are recyclable
            System.out.println("Would you like to enter another water bottle? ");
            System.out.print("Enter Y for yes or N for no: ");
            input = keyboard.nextLine(); // read a line
            repeat = input.charAt(0); // get the first character
        } while (repeat == 'y' || repeat == 'Y');
    }
}