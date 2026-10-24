Ejercicio 6: Empleados de una pequena tienda

Como ejecutar
Version: Java 17
Compilar: javac Empleado.java EmpleadoFijo.java EmpleadoPorHora.java EmpleadoComision.java Main.java
Ejecutar: java Main

Decisiones de diseno
La parte que se hereda son los atributos nombre e identificador, que se inicializan usando super desde los constructores hijos, ademas del metodo getter de nombre. El comportamiento que cambia es el metodo calcularPago. Cada subclase sobrescribe este metodo para aplicar su propia regla matematica, ignorando el calculo de la clase base.

Evidencia de salida en consola
PAGOS DE EMPLEADOS
Laura: $1500.0
Pedro: $600.0
Sofia: $500.0

Reto
Categoria propuesta: Easy

Anadi una tercera subclase llamada EmpleadoComision que calcula el pago basandose en un porcentaje de ventas. En el archivo Main amplie el arreglo a 3 posiciones para incluir este nuevo empleado. El ciclo for calculo y mostro su pago correctamente sin necesitar ninguna modificacion en su logica, comprobando que el polimorfismo maneja nuevos subtipos automaticamente.