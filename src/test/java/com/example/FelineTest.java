package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.eatMeat();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensRandomAmount() {
        Feline feline = new Feline();
        int expected = 5;
        int actual = feline.getKittens(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }
}