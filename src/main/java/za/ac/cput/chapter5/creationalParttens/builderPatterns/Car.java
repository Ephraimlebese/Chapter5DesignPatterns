package za.ac.cput.chapter5.creationalParttens.builderPatterns;

/**
 * Created by student on 2015/03/11.
 */
public class Car {
    private String Seats;
    private String aircon;
    private String transmision;

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getAircon() {
        return aircon;
    }

    public void setAircon(String aircon) {
        this.aircon = aircon;
    }

    public String getSeats() {
        return Seats;
    }

    public void setSeats(String seats) {
        Seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Seats='" + Seats + '\'' +
                ", aircon='" + aircon + '\'' +
                ", transmision='" + transmision + '\'' +
                '}';
    }
}
