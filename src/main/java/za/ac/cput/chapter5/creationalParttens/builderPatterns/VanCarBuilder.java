package za.ac.cput.chapter5.creationalParttens.builderPatterns;

/**
 * Created by student on 2015/03/11.
 */
public class VanCarBuilder implements CarBuilder {

    private Car car;

    public VanCarBuilder(){
        car = new Car();
    }

    @Override
    public void buildSeats(){
        car.setSeats("soft leather");
    }

    @Override
    public void buildAircon(){
        car.setSeats("no");
    }

    @Override
    public void buildTransmision(){
        car.setTransmision("automatic");
    }

    @Override
    public Car getCar(){
        return car;
    }
}
