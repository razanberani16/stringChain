package stringCahin.stringCahin;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
public class systemTest {
	@Test
    public void testRunEndToEnd() {
        // יוצרים סטאב של D
	    ChainMain runner = new ChainMain();
        // יוצרים את C עם הסטאב
	    String result=runner.run();
	    assertEquals("HELLO", result);

        // קוראים ל־C — לא לסטאב!
	}
	@Test
	public void testSystemFull() {
		ChainMain runner = new ChainMain();
	    assertEquals("HELLO", runner.run());
	}

}
