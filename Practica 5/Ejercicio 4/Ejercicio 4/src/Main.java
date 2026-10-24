public class Main {
    public static void main(String[] args) {
        Sensor[] sensores = new Sensor[3];
        
        sensores[0] = new SensorTemperatura("T-01", "Zona Norte");
        sensores[1] = new SensorHumedad("H-01", "Zona Sur");
        sensores[2] = new SensorLuz("L-01", "Techo Central");

        System.out.println("--- LECTURA DE SENSORES ---");
    
        for (int i = 0; i < sensores.length; i++) {
            System.out.println("[" + sensores[i].getUbicacion() + "] " + sensores[i].leer());
        }

        System.out.println("\n--- PRUEBA DE CALIBRACIÓN ---");
        if (sensores[0] instanceof Calibrable) {
            Calibrable sensorCalibrable = (Calibrable) sensores[0];
            sensorCalibrable.calibrar();
        }

        System.out.println("\n--- NUEVA LECTURA DESPUÉS DE CALIBRAR ---");
        System.out.println("[" + sensores[0].getUbicacion() + "] " + sensores[0].leer());
    }
}