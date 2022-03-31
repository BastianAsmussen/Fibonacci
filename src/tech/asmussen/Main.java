package tech.asmussen;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    private static BigInteger[] fibonacciCache;

    public static void main(String[] args) {

        System.out.println("Use the --sequence argument to get the entire sequence up to your selected number.");

        Scanner scanner = new Scanner(System.in);

        boolean sequence = args.length > 0 && args[0].equalsIgnoreCase("--sequence");

        boolean validNumber = false;

        long n = 0;

        do {

            System.out.print("What number of the fibonacci sequence do you want? ");
            String rawInput = scanner.nextLine();

            try {

                n = Long.parseLong(rawInput);
                
                validNumber = true;

                scanner.close();

            } catch (NumberFormatException e) {

                System.out.println("[ERROR]: Invalid number, please try again!");
            }

        } while (!validNumber);

        System.out.println();

        fibonacciCache = new BigInteger[(int) n + 1];

        final long START_TIME = System.currentTimeMillis();

        fibonacci(n);

        final double END_TIME = (System.currentTimeMillis() - START_TIME) / 1_000D;
        final String[] TIME = String.valueOf(END_TIME).split("\\.");

        StringBuilder fibonacciValue = new StringBuilder();

        if (sequence) {

            for (long i = 0; i < n; i++) {

                fibonacciValue.append(fibonacci(i)).append(", ");
            }

            fibonacciValue.delete(fibonacciValue.length() - 2, fibonacciValue.length());

        } else fibonacciValue.append(fibonacci(n));
        
        System.out.printf(((sequence) ? "Fibonacci Sequence:" : "Fibonacci Number:") + " %s.%n", fibonacciValue);
        System.out.printf("Time: %s second(s) and %s millisecond(s).%n", TIME[0], TIME[1]);
    }

    private static BigInteger fibonacci(long n) {

        if (n <= 1) return BigInteger.valueOf(n);
        if (fibonacciCache[(int) n] != null) return fibonacciCache[(int) n];

        BigInteger nthFibonacciNumber = fibonacci(n - 1).add(fibonacci(n - 2));

        fibonacciCache[(int) n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
