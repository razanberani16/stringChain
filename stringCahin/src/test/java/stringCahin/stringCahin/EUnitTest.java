package stringCahin.stringCahin;

import org.junit.Test;

public class EUnitTest {
	
    @Test(expected = IllegalArgumentException.class)
    public void testEShortInput() {
        E e = new E();
        e.process("HE");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIntegration_D_EStub_Fails() {
        EStub estub = new EStub(true);
        D d = new D(estub);
        d.process("HEL");
    }
}