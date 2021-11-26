package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManePositiveTest {

        private final String actual;
        private final boolean expected;

        public LionDoesHaveManePositiveTest(String actual, boolean expected){
            this.actual = actual;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[] Mane() {
            return new Object[][] {
                    {"Самка", false},
                    {"Самец", true},
            };
        }
        @Test
        public void doesHaveManePositiveTest() throws Exception {
            Lion lion = new Lion(actual);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected,actual);
        }
    }


