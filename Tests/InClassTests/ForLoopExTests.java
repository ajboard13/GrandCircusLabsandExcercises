package InClassTests;

import InClassWork.ForLoopEx;
import org.junit.Assert;
import org.junit.Test;

public class ForLoopExTests {
    @Test
    public void forLoopReturns1through4(){
        Assert.assertEquals(ForLoopEx.forLoop(), "0 1 2 3 4 ");
    }
}
