import static org.junit.Assert.*;

public class ReadingTest {

    @org.junit.Test
    public void justDoIt() {
        Reading object = new Reading();
        String actual = object.justDoIt();
        String expected= "Reading... ";
        assertEquals(actual,expected);
    }
}