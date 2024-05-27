

public class Fibonacci {

    public static int fib(int n)
    {
        if( n <= 0 ) return 0;
        if( n == 1 ) return 1;

        int x = fib(n-1);
        int y = fib(n-2);

        return (x+y);
    }

    public static void main(String[] args) {

        int N=3;

        int ans = fib(N);

        System.out.println("Fib(" + N + ") = "+ ans);
    }

}
