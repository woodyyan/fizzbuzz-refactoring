package org.katas.refactoring.fizzbuzz;


public class FizzBuzz {

    public String sayIt(int input) {
        String result = "";

        if (String.valueOf(input).contains("3")) return "Fizz";

        result = dividedBy357(input, result);

        if (!"".equals(result)) {
            return result;
        }
        return String.valueOf(input);
    }

    private String dividedBy357(int input, String result) {
        int flag = 0;
        flag += input % 3 == 0 ? 0b001 : 0;
        flag += input % 5 == 0 ? 0b010 : 0;
        flag += input % 7 == 0 ? 0b100 : 0;

        String[] items = {"Fizz", "Buzz", "Whizz"};
        int i = 0;
        while (i < 3) {
            if (((flag >> i) & 1) == 1) {
                result += items[i];
            }
            i++;
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
