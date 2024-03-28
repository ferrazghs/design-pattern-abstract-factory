package factory;

import aircrafts.IAircraft;
import landvehicles.ILandVehicle;

public interface ITransportVehicle {
    ILandVehicle createTransportVehicle();

    IAircraft createTransportAircraft();
}
