package factory;

import aircrafts.Helicopter;
import aircrafts.IAircraft;
import landvehicles.ILandVehicle;
import landvehicles.Motorcycle;

public class NineNineTransport implements ITransportVehicle {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
