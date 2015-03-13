package za.ac.cput.chapter5.structuralPatterns.adapterPatternTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.structuralParttens.adapterPattern.ProductAdapter;
import za.ac.cput.chapter5.structuralParttens.adapterPattern.ProductStore;

/**
 * Created by student on 2015/03/13.
 */
public class adapterTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testProductct() throws Exception {
        ProductAdapter productAdapter = new ProductStore();
        productInfo(productAdapter);



    }
    public static void productInfo(ProductAdapter productAdapter){
        Assert.assertEquals(productAdapter.toString(),"fg");
    }

    @After
    public void tearDown() throws Exception {


    }
}
