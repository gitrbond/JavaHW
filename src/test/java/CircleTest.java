import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void TestArea() throws Exception{
        Circle c = new Circle(3);
        double area = c.Area();
        assertEquals(3 * 3 * Math.PI, area);
    }
}