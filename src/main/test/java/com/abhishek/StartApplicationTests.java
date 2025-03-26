package com.abhishek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StartApplicationTests {

    @Test
    public void testIndex() {
        StartApplication app = new StartApplication();
        String expected = "index";
        String result = app.index(null); // or any mocked model
        assertEquals(expected, result);
    }
}
