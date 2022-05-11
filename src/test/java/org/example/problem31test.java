package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem31test {

    @Test
    void testEditDistance() {
        problem31.editDistanceBF("kitten", "sitting");

    }
    @Test
    void test_2()
    {
        problem31.editDistanceBF("kitten","sinhu");
    }
}
