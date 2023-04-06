package ru.tarabrin.stqa.test;

import org.testng.annotations.Test;
import ru.tarabrin.test.Rectangle;

public class RectangleTest {
    @Test
    public void testArea () {
        Rectangle r = new Rectangle(3, 5);
        assert r.Area() == 15;
    }
}
