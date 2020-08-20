package org.katas.refactoring.fizzbuzz;


public class FizzBuzz {


    public String sayIt(int input) {


        String result = "";

        if (contains3(input)) return "Fizz";

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

        if (!"".equals(result)) {
            return result;
        }
        return String.valueOf(input);
    }

    private boolean contains3(int input) {
        int temp = input;
        while (temp != 0) {
            if (temp % 10 == 3) {
                return true;
            }
            temp /= 10;
        }
        return false;
    }

    private boolean contains3New(int input) {
        return String.valueOf(input).contains("3");
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 200; i++) {
            System.out.println(fizzBuzz.sayIt(i + 1));
        }
    }
}
