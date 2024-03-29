import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib_old(int n) {
    if (n <= 1)
      return n;

    return calc_fib_old(n - 1) + calc_fib_old(n - 2);
  }

  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    long a =0,b=1;
    long c = 2;
    for(int i=2;i<=n;i++){
      c = a+b;
      a=b;
      b=c;

    }
    return c;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
