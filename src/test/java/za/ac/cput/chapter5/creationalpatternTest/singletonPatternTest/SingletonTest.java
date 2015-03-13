package za.ac.cput.chapter5.creationalpatternTest.singletonPatternTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.creationalParttens.singletonPattern.Phonebook;

/**
 * Created by student on 2015/03/11.
 */
public class SingletonTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testaddNumber() throws Exception {
        Phonebook myPH = Phonebook.getInstance();
        Assert.assertEquals(072, myPH.addNumber());

    }

    @Test
    public void testaddName() throws Exception {
        Phonebook myPH = Phonebook.getInstance();
        Assert.assertEquals("thabo", myPH.addName());
    }

    @After
    public void tearDown() throws Exception {


    }
}
