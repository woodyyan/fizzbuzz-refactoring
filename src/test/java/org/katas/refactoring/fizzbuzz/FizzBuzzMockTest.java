package org.katas.refactoring.fizzbuzz;

import org.junit.Test;

import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class FizzBuzzMockTest {

    @Test
    public void should_get_output_from_stub() {
        FizzBuzz fizzBuzz = mock(FizzBuzz.class);
        PrintStream out = mock(PrintStream.class);

        when(fizzBuzz.sayIt(1)).thenReturn("1");
        when(fizzBuzz.sayIt(2)).thenReturn("haha");
        when(fizzBuzz.sayIt(3)).thenReturn("Fizz");

        FizzBuzz.application(fizzBuzz, out, 3);

        verify(out).println("1");
        verify(out).println("haha");
        verify(out).println("Fizz");
    }

    @Test
    public void should_print_as_fake() {

        FizzBuzz fizzBuzz = mock(FizzBuzz.class);
        StringBuilder result = new StringBuilder();
        PrintStream out = new PrintStream(mock(OutputStream.class)) {
            @Override
            public void println(String x) {
                result.append(x);
            }
        };

        when(fizzBuzz.sayIt(1)).thenReturn("1");
        when(fizzBuzz.sayIt(2)).thenReturn("haha");
        when(fizzBuzz.sayIt(3)).thenReturn("Fizz");

        FizzBuzz.application(fizzBuzz, out, 3);

        assertThat(result.toString(), is("1hahaFizz"));
    }
}
