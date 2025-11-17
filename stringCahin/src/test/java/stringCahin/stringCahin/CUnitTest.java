package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class CUnitTest {
    @Test
    public void testCWithStub() {
        // יוצרים סטאב של D
        DStub stub = new DStub();
        // יוצרים את C עם הסטאב
        C c = new C(stub);
        // קוראים ל־C — לא לסטאב!
        String result = c.process("HE");
        // מאמתים את הפלט
        assertEquals("HELX", result);
    }
    @Test
    public void testIntegration_A_B_CStub() {
        CStub cstub = new CStub();
        B b = new B(cstub);
        A a = new A(b);
        String result = a.process(""); 
        assertEquals("HE", result.substring(0, 2));
    }
}