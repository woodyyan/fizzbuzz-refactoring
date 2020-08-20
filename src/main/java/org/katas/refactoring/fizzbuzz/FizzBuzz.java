package org.katas.refactoring.fizzbuzz;


public class FizzBuzz {

    public String sayIt(int input) {
        String result;

        if (String.valueOf(input).contains("3")) return "Fizz";

        result = dividedBy357(input);

        if (!"".equals(result)) {
            return result;
        }
        return String.valueOf(input);
    }

    private String dividedBy357(int input) {
        String result = "";
        if (input % 3 == 0) {
            result += "Fizz";
        }
        if (input % 5 == 0) {
            result += "Buzz";
        }
        if (input % 7 == 0) {
            result += "Whizz";
        }
        return result;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 200; i++) {
            System.out.println(fizzBuzz.sayIt(i + 1));
        }
    }
}
