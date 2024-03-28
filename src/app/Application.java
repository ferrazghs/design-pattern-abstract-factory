package app;

import aircrafts.IAircraft;
import boat.IBoat;
import factory.ITransportBoat;
import factory.ITransportVehicle;
import landvehicles.ILandVehicle;

public class Application {

    private static ILandVehicle vehicle;
    private static IAircraft aircraft;

    private static IBoat boat;

    public Application(ITransportVehicle factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public Application(ITransportBoat factoryBoat) {
        boat = factoryBoat.createTransportBoat();
    }

    public void startRoute(Company company) {

        if (company == Company.UBER || company == Company.NINENINE) {
            vehicle.startRoute();
            aircraft.startRoute();
        } else {
            boat.startRoute();
        }
    }
}
