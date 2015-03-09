package za.ac.cput.smallprog11;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class DisablingProgTest extends TestCase{
    @Test
    public void test1(){
        DisablingProg dp = new DisablingProg();
        dp.mainEgOne();
    }

    @Ignore
    @Test
    public void test2(){
        DisablingProg dp = new DisablingProg();
        dp.mainEgTwo();
    }

}