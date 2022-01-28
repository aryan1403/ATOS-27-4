package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {
    
    @Test
    public void add(){
        assertEquals(9, App.add(4, 5)); // Test Passed
        assertTrue(App.sub(2, 1) > 0); 
        assertEquals(10, App.mul(2, 5));
        assertEquals(null, App.divide(1, 0));
    }
}
