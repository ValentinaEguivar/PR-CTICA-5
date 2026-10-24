public abstract class Sensor {
    protected String id;
    protected String ubicacion;

    public Sensor(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }
    public abstract String leer();

    public String getId() {
        return id;
    }
    public String getUbicacion() {
        return ubicacion;
    }
}