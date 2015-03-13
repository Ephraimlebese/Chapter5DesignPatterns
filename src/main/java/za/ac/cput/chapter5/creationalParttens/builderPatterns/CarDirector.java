package za.ac.cput.chapter5.creationalParttens.builderPatterns;

/**
 * Created by student on 2015/03/11.
 */
public class CarDirector {
    private CarBuilder carBuilder = null;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void constractCar(){
        carBuilder.buildSeats();
        carBuilder.buildAircon();
        carBuilder.buildTransmision();
    }
    public Car getCar(){
        return carBuilder.getCar();
    }
}
