package pl.net.lion.jpp;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JPPTest {

    @Test
    public void run() {
        JPP instance = new JPP();

        boolean result = instance.run();

        assertTrue(result);
    }
}