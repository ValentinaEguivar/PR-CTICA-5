public class SensorLuz extends Sensor {
    public SensorLuz(String id, String ubicacion) {
        super(id, ubicacion);
    }
    @Override
    public String leer() {
        return "Luminosidad: 850 lux (Óptima)";
    }
}