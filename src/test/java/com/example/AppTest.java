package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue1()
    {
        assertEquals(20,App.calc(5,5,5,5));
    }
    @Test
    public void shouldAnswerWithTrue2()
    {
        assertEquals(40,App.calc(10,10,10,10));
    }
    @Test
    public void shouldAnswerWithTrue3()
    {
        assertEquals(28,App.calc(7,7,7,7));
    }
    @Test
    public void shouldAnswerWithTrue4()
    {
        assertEquals(36,App.calc(9,9,9,9));
    }
}
