package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LionExceptionTest {
    @Test
    public void testDoesHaveManeExceptionMessage(){
        try{
            Lion lion = new Lion("Пеп");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка",e.getMessage());
        }
    }
}
