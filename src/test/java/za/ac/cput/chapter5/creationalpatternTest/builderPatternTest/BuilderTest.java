package za.ac.cput.chapter5.creationalpatternTest.builderPatternTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.creationalParttens.builderPatterns.*;

/**
 * Created by student on 2015/03/11.
 */
public class BuilderTest {
    @Before
    public void setUp() throws Exception {
        

    }

    @Test
    public void testSudanCar() throws Exception {
        CarBuilder carbuilder = new SudanCarBuilder();
        CarDirector carDirector = new CarDirector(carbuilder);
        carDirector.constractCar();
        Car car = carDirector.getCar();

        Assert.assertEquals("Car{Seats='yes', aircon='null', transmision='manual'}",car.toString());

    }

    @Test
    public void testVanCar() throws Exception {

        CarBuilder carbuilder = new VanCarBuilder();
        CarDirector carDirector = new CarDirector(carbuilder);
        carDirector.constractCar();
        Car car = carDirector.getCar();

        Assert.assertEquals("Car{Seats='no', aircon='null', transmision='automatic'}",car.toString());
    }

    @After
    public void tearDown() throws Exception {
        

    }
}
