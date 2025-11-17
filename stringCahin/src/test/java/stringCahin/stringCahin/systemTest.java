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
	@Test
	public void testFullChainWithR() {
		E e = new E();
	    D d = new D(e);
	    C c = new C(d);
	    B b = new B(c);
	    A a = new A(b);

	    String result = a.process("R");

	    assertEquals("RHELLO", result);
	}
	@Test
	public void testSystem_MissingB() {
	   E e = new E();
	   D d = new D(e);
	   C c = new C(d);
	   A a = new A(null); 

	   try {
		   a.process("");
	       fail("Expected NullPointerException");
	   } catch (NullPointerException ex) {
	          
	   }
       
    }

}
