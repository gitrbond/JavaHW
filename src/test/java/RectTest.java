import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectTest {

    @Test
    public void TestArea() throws Exception{
        Rect r = new Rect(3, 4);
        double area = r.Area();
        assertEquals(12, area);
    }
}