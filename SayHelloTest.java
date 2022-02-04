import static org.junit.Assert.*;
import org.junit.*;

public class SayHelloTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello World?", SayHello.helloWorld());
    }

}
