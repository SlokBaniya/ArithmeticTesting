import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArithmeticTesting {
    @Test
    public void testAddition(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 10;
        float actualResult = arithmetic.sum(4,6);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testSub(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 45;
        float actualResult = arithmetic.sub(4545,445);
        assertEquals(expectedResult,actualResult);
    }
}
