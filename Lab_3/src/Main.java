public class Main {

    // Function to print the fibonacci series
    static int fib(int n)
    {
        // Base
        if (n <= 1)
            return n;

        // Recurse
        return fib(n - 1)
                + fib(n - 2);
    }

    public static void main(String args[])
    {
        // Given Number n
        int n = 30;

        // Print the first n numbers
        for (int i = 0; i < n; i++) { System.out.println(fib(i) + " "); }
    }
}