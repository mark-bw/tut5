package CItut;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import CItut.Calc;

public class TestCalc {
   @Test
    public void testCalc() {
        assertEquals(7, new Calc().subtract(10, 3));
    }
   
   @Test
	public void testCalc() {
		assertEquals(5, new Calc().add(2, 3));
	}

    
}
