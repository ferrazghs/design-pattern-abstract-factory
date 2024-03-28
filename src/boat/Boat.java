package boat;

public class Boat implements IBoat {
    @Override
    public void startRoute() {
        getCargo();
        waves();
        System.out.println("Iniciando rota!");
    }

    @Override
    public void getCargo() {
        System.out.println("Tripulantes embarcados com sucesso!");
    }

    @Override
    public void waves() {
        System.out.println("Ondas ok!");
    }
}
