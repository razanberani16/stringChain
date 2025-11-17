package stringCahin.stringCahin;
<<<<<<< HEAD

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
=======
import org.junit.Test;
import static org.junit.Assert.*;
//Unit Test for Class A
public class AUnitTest {
 @Test
 public void testAWithStub() {
     BStub bStub = new BStub();
     A a = new A(bStub);
     String result = a.process("");
     assertEquals("H", result);
 } }
>>>>>>> 04efd5da42ca9c1f2d47c609ee3804d6a3cb9551
