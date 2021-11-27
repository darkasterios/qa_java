package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.eatMeat();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensRandomAmount() {
        int expected = 5;
        int actual = feline.getKittens(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittens() {
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }
}