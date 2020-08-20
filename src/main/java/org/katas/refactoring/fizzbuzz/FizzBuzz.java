package org.katas.refactoring.fizzbuzz;


import java.io.PrintStream;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String sayIt(int number) {
        String word;

        if (String.valueOf(number).contains("3")) return FIZZ;

        word = dividedBy357(number);

        if (!"".equals(word)) {
            return word;
        }
        return String.valueOf(number);
    }

    private String dividedBy357(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += FIZZ;
        }
        if (number % 5 == 0) {
            result += BUZZ;
        }
        if (number % 7 == 0) {
            result += WHIZZ;
        }
        return result;
    }

    public static void main(String[] args) {
        application(new FizzBuzz(), System.out, 200);
    }

    static void application(FizzBuzz fizzBuzz, PrintStream out, int count) {
        for (int i = 0; i < count; i++) {
            out.println(fizzBuzz.sayIt(i + 1));
        }
    }
}
