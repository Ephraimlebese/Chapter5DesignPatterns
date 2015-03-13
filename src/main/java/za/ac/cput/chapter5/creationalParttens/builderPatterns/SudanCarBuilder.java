package za.ac.cput.chapter5.creationalParttens.builderPatterns;

/**
 * Created by student on 2015/03/11.
 */
public class SudanCarBuilder implements CarBuilder {
    private Car car;

    public SudanCarBuilder(){
        car = new Car();
    }

    @Override
    public void buildSeats(){
        car.setSeats("leather");
    }

    @Override
    public void buildAircon(){
        car.setSeats("yes");
    }

    @Override
    public void buildTransmision(){
        car.setTransmision("manual");
    }

    @Override
    public Car getCar(){
        return car;
    }

}
