import java.util.ArrayList;

public class Fibonacci {

    public static int fib(int n, ArrayList<Boolean> Visited, ArrayList<Integer> Returend_Value)
    {
        if( n <= 0 ) return 0;
        if( n == 1 ) return 1;
        
        // This visited array will reduce the repeated function calls
        if( Visited.get(n) == false )
        {
            int x = fib(n-1, Visited, Returend_Value);
            int y = fib(n-2, Visited, Returend_Value);

            Visited.add(n, true);
            Returend_Value.add(n, (x+y));
        }

        return ( Returend_Value.get(n) );
    }

    public static void main(String[] args) {
        
        int n=8;
        
        int N = n+1;
        ArrayList<Boolean> Visited = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            Visited.add(false);
        }

        ArrayList<Integer> Returend_Value = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            Returend_Value.add(-1);
        }

        int ans = fib(n , Visited , Returend_Value);

        System.out.println("Fib(" + n + ") = "+ ans);

    }

}
