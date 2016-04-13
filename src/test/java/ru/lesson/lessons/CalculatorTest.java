package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oleg on 13.04.2016.
 */
public class CalculatorTest {

    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());

    }

    @Test
    public void div() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(1, 1);
        assertEquals(1, calculator.getResult());

    }

}