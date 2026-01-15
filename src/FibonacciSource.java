//Fatima Harrison, CEN 4802C, Assignment 1, Prof. O'Toole, 01/15/26
/**
 * This is a project containing a class that demonstrates recursion by computing
 * the nth term of the Fibonacci sequence.
 */
public class FibonacciSource{

    /**
     * Recursively computes the nth Fibonacci number.
     * <p>
     * The Fibonacci sequence is defined as:
     * <br>fib(0) = 0
     * <br>fib(1) = 1
     * <br>fib(n) = fib(n - 1) + fib(n - 2) for n >= 2
     *
     * @param n is the position in the Fibonacci sequence to compute
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base cases
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }
    /**
     * The main method that calls the recursive Fibonacci method
     * and prints the result for n = 10.
     *
     * @param args command-line arguments which is not used.
     */
    public static void main(String[] args) {
        int n = 10;                 // The term to compute
        int result = fibonacci(n);  // Call the recursive method

        System.out.println("The " + n +
                "th term of the Fibonacci sequence is " + result + ".");
    }
}
