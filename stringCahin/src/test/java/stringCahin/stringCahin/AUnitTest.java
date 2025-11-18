package stringCahin.stringCahin;


import org.junit.Test;
import static org.junit.Assert.*;

public class AUnitTest {
    @Test
    public void testAAddsH() {
        BStub stub = new BStub();
        A a = new A(stub);

        String result = a.process("R");

        assertEquals("RH", result);
        assertEquals("RHX", result);
    }
}

//Unit Test for Class A
 @Test
 public void testAWithStub() {
     BStub bStub = new BStub();
     A a = new A(bStub);
     String result = a.process("");
     assertEquals("H", result);
 } }

