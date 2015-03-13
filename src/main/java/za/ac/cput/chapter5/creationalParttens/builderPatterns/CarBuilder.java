package za.ac.cput.chapter5.creationalParttens.builderPatterns;

/**
 * Created by student on 2015/03/11.
 */
public interface CarBuilder {

    public void buildSeats();
    public void buildAircon();
    public void buildTransmision();
    public Car getCar();
}
