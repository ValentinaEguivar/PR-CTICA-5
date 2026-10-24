public class SensorHumedad extends Sensor {
    public SensorHumedad(String id, String ubicacion) {
        super(id, ubicacion);
    }

    @Override
    public String leer() {
        return "Humedad: 65%"; // Valor simulado
    }
}