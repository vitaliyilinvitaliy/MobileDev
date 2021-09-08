package com.example.lab_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        TestClass t = new TestClass();

        assertEquals(t.min(1,2), 1);
        assertEquals(t.min(2,1), 1);
        assertEquals(t.min(1,1), 1);
        assertEquals(t.min(1,-1), -1);

        assertEquals(t.max(1,2), 2);
        assertEquals(t.max(2,1), 2);
        assertEquals(t.max(1,1), 1);
        assertEquals(t.max(1,-1), 1);

        assertEquals(4, 2 + 2);
    }
}