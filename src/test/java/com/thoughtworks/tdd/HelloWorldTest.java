package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Leave me alone."));
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }

    @Test
    void fizzBuzz() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //assertEquals("fuck",helloWorld.fizzBuzz());
        assertEquals("1",helloWorld.fizzBuzz(1));
        assertEquals("Fizz",helloWorld.fizzBuzz(3));
        assertEquals("Fizz",helloWorld.fizzBuzz(6));
        assertEquals("Buzz",helloWorld.fizzBuzz(5));
        assertEquals("Buzz",helloWorld.fizzBuzz(10));
        assertEquals("Whizz",helloWorld.fizzBuzz(7));
        assertEquals("Whizz",helloWorld.fizzBuzz(14));
        assertEquals("FizzBuzz",helloWorld.fizzBuzz(15));
        assertEquals("FizzBuzz",helloWorld.fizzBuzz(45));
        assertEquals("FizzWhizz",helloWorld.fizzBuzz(21));
        assertEquals("FizzWhizz",helloWorld.fizzBuzz(42));
        assertEquals("BuzzWhizz",helloWorld.fizzBuzz(35));
        assertEquals("BuzzWhizz",helloWorld.fizzBuzz(70));
        assertEquals("FizzBuzzWhizz",helloWorld.fizzBuzz(105));
    }
}
