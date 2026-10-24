Ejercicio 3: Tarifas de Entrega

Cómo ejecutar
- Versión: Java 17
- Compilar: `javac *.java`
- Ejecutar: `java Main`

Evidencia y Conceptos de Polimorfismo
Salida de la consola:
Destino: Centro (Bici)
Costo normal: $30.0
Costo con recargo por lluvia ($20): $50.0

Destino: Afueras (Auto)
Costo normal: $300.0
Costo con recargo por lluvia ($20): $320.0

Respuestas teóricas requeridas:
* ¿Qué determina qué métodos puedes llamar?
  El *tipo de la variable de referencia* (el tipo estático, en este caso `Entrega`) determina qué métodos están disponibles para el compilador.
* ¿Qué determina qué implementación sobrescrita se ejecuta?
  El *objeto real creado en memoria* (el tipo dinámico, en este caso `EntregaBicicleta` o `EntregaAuto`) es el que decide, en tiempo de ejecución, cuál código específico se ejecuta.

Reto:

¿Qué agregué?
Realicé el diagrama de texto solicitado para ilustrar el polimorfismo dinámico y la relación entre la referencia y el objeto:

 Referencia (Tipo estático)     Objeto en Memoria (Tipo dinámico)
  [ Entrega variable ]  ->  [ Objeto EntregaBicicleta ]