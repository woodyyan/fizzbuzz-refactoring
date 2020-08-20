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
}