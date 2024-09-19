package scanner;

import java.util.Scanner;

/**
 * Example class for reading an input with 5-times check before break.
 *
 * @author Andreas Schneider
 */
public class ScannerInput
{

    public int readInput()
    {

        boolean validInput = false;
        int result = -1;
        Scanner sc = new Scanner(System.in);
        int wrongCounter = 0;

        while (!validInput) {
            if (wrongCounter >= 5) {
                break;
            }

            try {

                System.out.println("Enter Age: ");
                int input = sc.nextInt();
                if (input > 0 && input <= 100) {
                    validInput = true;
                    result = input;
                } else {
                    wrongCounter++;
                }
            } catch (Exception ex) {
                System.out.println(ex.getLocalizedMessage());
                validInput = false;
                wrongCounter++;
                sc.next();
            }
        }
        return result;
    }
}
