import static org.junit.Assert.*;
import org.junit.*;


public class MidtermTest {
    @Test
    public void multiplication() {
    assertEquals(1, Midterm.times(1, 1)); 
    }
    
    @Test
    public void multiplication2() {
    assertEquals(20, Midterm.times(1, 2)); //fails 
    }
}
