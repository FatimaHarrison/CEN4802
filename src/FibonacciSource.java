// Fatima Harrison, CEN 4802C, Assignment 1, Prof. O'Toole, 01/15/26
//Declaring my primary class 'FibonacciSource'
public class FibonacciSource {
//The setting of the Fibonacci sequence.
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base cases
        }
        //Returning the recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
//The main function that calls the recursive Fibonacci method
    /* and prints out the results for n=10.
    */
    public static void main(String[] args) {
        //Declaring the variables
        int n = 10; // Integer n = 10
        int result = fibonacci(n);  // Call the recursive method
        //The output of the sequence print out line
        System.out.println("The " + n +
                "th term of the Fibonacci sequence is " + result + ".");
    }
}
