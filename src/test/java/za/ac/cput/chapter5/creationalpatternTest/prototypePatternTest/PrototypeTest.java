package za.ac.cput.chapter5.creationalpatternTest.prototypePatternTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.creationalParttens.prototypePattern.Clerk;
import za.ac.cput.chapter5.creationalParttens.prototypePattern.Employees;
import za.ac.cput.chapter5.creationalParttens.prototypePattern.Programer;

/**
 * Created by student on 2015/03/11.
 */
public class PrototypeTest {
    @Before
    public void setUp() throws Exception {
        

    }

    @Test
    public void testClerk() throws Exception {
        Employees clerk = new Clerk("Mrs");

        Assert.assertEquals(clerk.toString(),"Clerk  Title:Mrs");

    }

    @Test
    public void testProgramer() throws Exception {
        Employees programer = new Programer("Mr");

        Assert.assertEquals(programer.toString(),"Programer  Title:Mr");

    }

    @After
    public void tearDown() throws Exception {
        

    }
}
