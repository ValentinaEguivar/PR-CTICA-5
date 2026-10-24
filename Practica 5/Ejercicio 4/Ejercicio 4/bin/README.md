Ejercicio 4: Sensores de Invernadero

Cómo ejecutar
- Versión: Java 17
- **Compilar: `javac *.java`
- Ejecutar: `java Main`

Decisiones de diseño (Abstracta vs Interfaz)
¿Por qué `Sensor` es una clase abstracta?** Porque todos los sensores comparten estado común (un `id` y una `ubicacion`) y código reutilizable (el constructor y los getters), pero no tiene sentido instanciar un "Sensor genérico".
¿Por qué `Calibrable` es una interfaz?** Porque calibrar es una *capacidad* o comportamiento. No todos los sensores se pueden calibrar (ej. el de humedad no). Usar una interfaz permite que solo las clases que queramos "firmen el contrato" de tener el método `calibrar()`.

Evidencia de salida en consola
--- LECTURA DE SENSORES ---
[Zona Norte] Temperatura: 22.0 °C
[Zona Sur] Humedad: 65%
[Techo Central] Luminosidad: 850 lux (Óptima)

--- PRUEBA DE CALIBRACIÓN ---
-> Sensor de temperatura 'T-01' calibrado correctamente.

--- NUEVA LECTURA DESPUÉS DE CALIBRAR ---
[Zona Norte] Temperatura: 24.5 °C


Reto:
¿Qué agregué?
Agregué un tercer sensor (`SensorLuz.java`) para demostrar el poder del polimorfismo. En `Main.java`, aumenté el arreglo a 3 posiciones y metí el nuevo sensor. El ciclo `for` que imprime los resultados no tuvo que ser modificado en absoluto (ni un solo `if` nuevo), demostrando que la estructura es totalmente escalable.