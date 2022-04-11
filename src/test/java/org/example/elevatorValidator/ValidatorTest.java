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
        assertTrue(isValid(6, "gggddddd"));
    }

    @Test
    void fourFloor7 (){
        assertTrue(isValid(6, "GGGDDDDDGGG"));
    }

    @Test
    void fourFloor6 (){
        assertFalse(isValid(4, "GGGDDDDDGGGGDDDDDG"));
    }

    @Test
    void fourFloor8 (){
        assertFalse(isValid(8, "GGDDDDDDDDDD"));
    }

    @Test
    void fourFloor9 (){
        assertFalse(isValid(3, "GGDDDGGDDDG"));
    }

    @Test
    void fourFloor10 (){
        assertTrue(isValid(8, "GGDDDDDDD"));
    }

    @Test
    void fourFloor11 (){
        assertTrue(isValid(8, "DDDDDDDGG"));
    }


}
