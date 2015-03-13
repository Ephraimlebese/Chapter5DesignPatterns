package za.ac.cput.chapter5.creationalpatternTest.factoryPatternTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.creationalParttens.factoryPattern.Shape;
import za.ac.cput.chapter5.creationalParttens.factoryPattern.Triangle;
import za.ac.cput.chapter5.creationalParttens.factoryPattern.Rectangle;

/**
 * Created by student on 2015/03/11.
 */
public class FactoryTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDog() throws Exception {
        Shape shape = new Rectangle();
        Assert.assertEquals("four", shape.howManyCorners());

    }

    @Test
    public void testCat() throws Exception {
        Shape shape = new Triangle();
        Assert.assertEquals("three", shape.howManyCorners());

    }

    @After
    public void tearDown() throws Exception {


    }
}
