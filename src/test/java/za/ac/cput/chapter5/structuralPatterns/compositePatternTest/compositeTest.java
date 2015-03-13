package za.ac.cput.chapter5.structuralPatterns.compositePatternTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.structuralParttens.compositePattern.File;
import za.ac.cput.chapter5.structuralParttens.compositePattern.FileDirectory;
import za.ac.cput.chapter5.structuralParttens.compositePattern.FileSystem;

/**
 * Created by student on 2015/03/13.
 */
public class compositeTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testFile() throws Exception {
        File file1 = new File("wayne");
        FileDirectory fileDirectory = new FileDirectory();
        fileDirectory.add(file1);
        Assert.assertEquals(file1.toString(), "File{artist='wayne'}");

    }

    @After
    public void tearDown() throws Exception {


    }
}
