package factory;

import boat.Boat;
import boat.IBoat;

public class BoatTransport implements ITransportBoat {


    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
