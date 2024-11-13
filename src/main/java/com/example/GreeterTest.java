package com.example;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;

public class GreeterTest {
    @Test
    public void ShouldGreet() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Greeting.sayHi();
        assertEquals("Hi!\n", outContent.toString());

        System.setOut(System.out);
    }  
}