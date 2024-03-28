package aircrafts;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        getCargo();
        wind();
        System.out.println("Iniciando rota!");
    }

    @Override
    public void getCargo() {
        System.out.println("Pessoas embarcadas com sucesso!");
    }

    @Override
    public void wind() {
        System.out.println("Vento ok!");
    }
}
