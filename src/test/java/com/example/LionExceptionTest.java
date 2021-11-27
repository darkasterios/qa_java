package com.example;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LionExceptionTest {
    @Mock
    Feline feline;

    @Test
    public void testDoesHaveManeExceptionMessage(){
        try{
            Lion lion = new Lion(feline,"Мелкий");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка",e.getMessage());
        }
    }
}
