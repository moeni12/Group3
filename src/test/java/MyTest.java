import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyTest {

    @Test
    void unitTest()
    {
        assertEquals(5, 5);
    }

    @Test
    void unitTest2()
    {
        assertEquals(5, 4);
    }

    @Test
    void unitTest3()
    {
        assertEquals(5, 5, "Messages are equal");
    }


}
