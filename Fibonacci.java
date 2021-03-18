import java.util.Scanner;
public class Fibonacci {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            //PROMPT THE USER TO ENTER AN INDEX FOR A FIBONACCI NUMBER
            System.out.print("Enter an index for a Fibonacci number: ");
            int index = scan.nextInt();

            //CALL THE fibonacciNumber() METHOD AND DISPLAY THE RESULTS
            System.out.println("The Fibonacci number at index " + index + " is " + fibonacciNumber(index));
        } 
    }

    //CREATE METHOD TO FIND FIBONACCI NUMBER
    public static long fibonacciNumber(long index) {

        //CREATE REDUCTION AND RECURSIVE CALLS WITH BASE CASES TO COMPUTE FOR THE FIBONACCI NUMBER
        if (index == 0){
            return 0;
        }
        else if (index == 1){
            return 1;
        }
        else {
            return fibonacciNumber(index - 1) + fibonacciNumber(index - 2);
        }
    }
}
