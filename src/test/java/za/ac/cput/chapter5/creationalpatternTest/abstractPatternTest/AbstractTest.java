package za.ac.cput.chapter5.creationalpatternTest.abstractPatternTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.creationalParttens.abstractPattern.Child;
import za.ac.cput.chapter5.creationalParttens.abstractPattern.Humans;
import za.ac.cput.chapter5.creationalParttens.abstractPattern.HumansFactory;
import za.ac.cput.chapter5.creationalParttens.abstractPattern.Parent;

/**
 * Created by student on 2015/03/11.
 */
public class AbstractTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testPerent() throws Exception {
        Humans parent = new Parent();
        Assert.assertEquals("story time",parent.goodNight());

    }

    @Test
    public void testChild() throws Exception {
        Humans child = new Child();
        Assert.assertEquals("sleep time",child.goodNight());

    }

    @After
    public void tearDown() throws Exception {


    }
}
