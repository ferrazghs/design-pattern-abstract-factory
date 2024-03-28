package factory;

import aircrafts.Airplane;
import aircrafts.IAircraft;
import landvehicles.Car;
import landvehicles.ILandVehicle;

public class UberTransport implements ITransportVehicle {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
