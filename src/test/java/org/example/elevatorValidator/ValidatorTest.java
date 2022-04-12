package org.example.elevatorValidator;

import org.junit.jupiter.api.Test;

import static org.example.elevatorValidator.Validator.isValid;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void oneFloor (){
        assertFalse(isValid(1, "GGGGGG"));
    }

    @Test
    void twoFloor (){
        assertTrue(isValid(2, "G"));
    }

    @Test
    void twoFloor2 (){
        assertTrue(isValid(2, "GDGD"));
    }

    @Test
    void twoFloor3 (){
        assertTrue(isValid(2, "DGDG"));
    }

    @Test
    void twoFloor4 (){
        assertFalse(isValid(2, "DDGDG"));
    }

    @Test
    void threeFloor (){
        assertTrue(isValid(3, "DDGDG"));
    }

    @Test
    void threeFloor2 (){
        assertTrue(isValid(3, "GG"));
    }

    @Test
    void threeFloor3 (){
        assertTrue(isValid(3, "DD"));
    }

    @Test
    void threeFloor4 (){
        assertFalse(isValid(3, "GGDDDGGDDDG"));
    }

    @Test
    void threeFloor5 (){
        assertFalse(isValid(3, "GGDGGDGGDGGDGG"));
    }

    @Test
    void fourFloor (){
        assertTrue(isValid(4, "DDD"));
    }

    @Test
    void fourFloor2 (){
        assertTrue(isValid(4, "GGG"));
    }

    @Test
    void fourFloor3 (){
        assertFalse(isValid(4, "GGGG"));
    }

    @Test
    void fourFloor4 (){
        assertFalse(isValid(4, "DDDD"));
    }

    @Test
    void fourFloor5 (){
        assertFalse(isValid(4, "GGGDDDDDGGGGDDDDDG"));
    }

    @Test
    void sixFloor (){
        assertTrue(isValid(6, "gggddddd"));
    }

    @Test
    void sixFloor1 (){
        assertTrue(isValid(6, "GGGDDDDDGGG"));
    }
    @Test
    void eightFloor (){
        assertFalse(isValid(8, "GGDDDDDDDDDD"));
    }

    @Test
    void eightFloor1 (){
        assertTrue(isValid(8, "GGDDDDDDD"));
    }

    @Test
    void eightFloor2 (){
        assertTrue(isValid(8, "DDDDDDDGG"));
    }


}
