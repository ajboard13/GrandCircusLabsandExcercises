package InClassTests;

import InClassWork.ForLoopEx;
import org.junit.Assert;
import org.junit.Test;

public class ForLoopExTests {
    @Test
    public void forLoopReturns1through4(){
        Assert.assertEquals(ForLoopEx.forLoop(), "0 1 2 3 4 ");
    }

    @Test
    public void forEachExTest(){
        Assert.assertEquals(ForLoopEx.forEachLoopEx(), "10,20,30,40,50,");
    }

    @Test
    public void forEachEx2Test(){
        Assert.assertEquals(ForLoopEx.forEachLoopEx2(), "James,Larry,Tom,Lacy,");
    }
}
