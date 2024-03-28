import app.Application;
import app.Company;
import factory.*;

public class Main {

    public static void configureApp() {
        Application app;
        ITransportVehicle factory;
        ITransportBoat factoryBoat;

        Company company = Company.NINENINE;

        if (company == Company.UBER) {
            factory = new UberTransport();
            app = new Application(factory);
        } else if (company == Company.NINENINE) {
            factory = new NineNineTransport();
            app = new Application(factory);
        } else {
            factoryBoat = new BoatTransport();
            app = new Application(factoryBoat);
        }

        app.startRoute(company);
    }

    public static void main(String[] args) {
        configureApp();
    }
}