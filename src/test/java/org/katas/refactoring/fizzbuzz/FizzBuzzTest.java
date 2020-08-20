package org.katas.refactoring.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_fizz_given_input_can_be_divided_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.sayIt(6);
        assertThat(actual, is("Fizz"));
    }

    @Test
    public void should_return_buzz_given_input_can_be_divided_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.sayIt(10);
        assertThat(actual, is("Buzz"));
    }

    @Test
    public void should_return_whizz_given_input_can_be_divided_by_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.sayIt(14);
        assertThat(actual, is("Whizz"));
    }

    @Test
    public void should_return_fizz_buzz_given_input_can_be_divided_by_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.sayIt(15);
        assertThat(actual, is("FizzBuzz"));
    }

    @Test
    public void should_return_fizz_whizz_given_input_can_be_divided_by_3_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.sayIt(21);
        assertThat(actual, is("FizzWhizz"));
    }

    @Test
    public void should_return_buzz_whizz_given_input_can_be_divided_by_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.sayIt(70);
        assertThat(actual, is("BuzzWhizz"));
    }

    @Test
    public void should_return_fizz_buzz_whizz_given_input_can_be_divided_by_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.sayIt(105);
        assertThat(actual, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_fizz_when_fizz_buzz_given_input_contains_3() {
        // 测试景色 测试包含3的情况
        // 一般等价类：
        // 13是包含3
        // 30是本应该说fizzbuzz
        // 35本应该说buzzwhizz
        // 315本应该说fizzbuzzwhizz

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.sayIt(3), is("Fizz"));
        assertThat(fizzBuzz.sayIt(13), is("Fizz"));
        assertThat(fizzBuzz.sayIt(30), is("Fizz"));
        assertThat(fizzBuzz.sayIt(35), is("Fizz"));
        assertThat(fizzBuzz.sayIt(315), is("Fizz"));
    }

    @Test
    public void should_smoke_test_pass_when_fizz_buzz_given_200_numbers() {
        String expected = "1\n" +
            "2\n" +
            "Fizz\n" +
            "4\n" +
            "Buzz\n" +
            "Fizz\n" +
            "Whizz\n" +
            "8\n" +
            "Fizz\n" +
            "Buzz\n" +
            "11\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Whizz\n" +
            "FizzBuzz\n" +
            "16\n" +
            "17\n" +
            "Fizz\n" +
            "19\n" +
            "Buzz\n" +
            "FizzWhizz\n" +
            "22\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "26\n" +
            "Fizz\n" +
            "Whizz\n" +
            "29\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "41\n" +
            "FizzWhizz\n" +
            "Fizz\n" +
            "44\n" +
            "FizzBuzz\n" +
            "46\n" +
            "47\n" +
            "Fizz\n" +
            "Whizz\n" +
            "Buzz\n" +
            "Fizz\n" +
            "52\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "Whizz\n" +
            "Fizz\n" +
            "58\n" +
            "59\n" +
            "FizzBuzz\n" +
            "61\n" +
            "62\n" +
            "Fizz\n" +
            "64\n" +
            "Buzz\n" +
            "Fizz\n" +
            "67\n" +
            "68\n" +
            "Fizz\n" +
            "BuzzWhizz\n" +
            "71\n" +
            "Fizz\n" +
            "Fizz\n" +
            "74\n" +
            "FizzBuzz\n" +
            "76\n" +
            "Whizz\n" +
            "Fizz\n" +
            "79\n" +
            "Buzz\n" +
            "Fizz\n" +
            "82\n" +
            "Fizz\n" +
            "FizzWhizz\n" +
            "Buzz\n" +
            "86\n" +
            "Fizz\n" +
            "88\n" +
            "89\n" +
            "FizzBuzz\n" +
            "Whizz\n" +
            "92\n" +
            "Fizz\n" +
            "94\n" +
            "Buzz\n" +
            "Fizz\n" +
            "97\n" +
            "Whizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "101\n" +
            "Fizz\n" +
            "Fizz\n" +
            "104\n" +
            "FizzBuzzWhizz\n" +
            "106\n" +
            "107\n" +
            "Fizz\n" +
            "109\n" +
            "Buzz\n" +
            "Fizz\n" +
            "Whizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "116\n" +
            "Fizz\n" +
            "118\n" +
            "Whizz\n" +
            "FizzBuzz\n" +
            "121\n" +
            "122\n" +
            "Fizz\n" +
            "124\n" +
            "Buzz\n" +
            "FizzWhizz\n" +
            "127\n" +
            "128\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "BuzzWhizz\n" +
            "Fizz\n" +
            "142\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "146\n" +
            "FizzWhizz\n" +
            "148\n" +
            "149\n" +
            "FizzBuzz\n" +
            "151\n" +
            "152\n" +
            "Fizz\n" +
            "Whizz\n" +
            "Buzz\n" +
            "Fizz\n" +
            "157\n" +
            "158\n" +
            "Fizz\n" +
            "Buzz\n" +
            "Whizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "164\n" +
            "FizzBuzz\n" +
            "166\n" +
            "167\n" +
            "FizzWhizz\n" +
            "169\n" +
            "Buzz\n" +
            "Fizz\n" +
            "172\n" +
            "Fizz\n" +
            "Fizz\n" +
            "BuzzWhizz\n" +
            "176\n" +
            "Fizz\n" +
            "178\n" +
            "179\n" +
            "FizzBuzz\n" +
            "181\n" +
            "Whizz\n" +
            "Fizz\n" +
            "184\n" +
            "Buzz\n" +
            "Fizz\n" +
            "187\n" +
            "188\n" +
            "FizzWhizz\n" +
            "Buzz\n" +
            "191\n" +
            "Fizz\n" +
            "Fizz\n" +
            "194\n" +
            "FizzBuzz\n" +
            "Whizz\n" +
            "197\n" +
            "Fizz\n" +
            "199\n" +
            "Buzz\n";

        FizzBuzz fizzBuzz = new FizzBuzz();
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            actual.append(fizzBuzz.sayIt(i + 1)).append("\n");
        }

        assertThat(expected, is(actual.toString()));
    }
}