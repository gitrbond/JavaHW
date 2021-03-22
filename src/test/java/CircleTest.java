import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void TestArea() throws Exception{
        Circle c = new Circle(4);
        double area = c.Area();
        assertEquals(4 * 4 * Math.PI, area);
    }
}