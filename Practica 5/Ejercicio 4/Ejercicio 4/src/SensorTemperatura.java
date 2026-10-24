public class SensorTemperatura extends Sensor implements Calibrable {
    private double temperatura;

    public SensorTemperatura(String id, String ubicacion) {
        super(id, ubicacion);
        this.temperatura = 22.0;
    }
    @Override
    public String leer() {
        return "Temperatura: " + this.temperatura + " °C";
    }
    @Override
    public void calibrar() {
        this.temperatura = 24.5;
        System.out.println("-> Sensor de temperatura '" + id + "' calibrado correctamente.");
    }
}