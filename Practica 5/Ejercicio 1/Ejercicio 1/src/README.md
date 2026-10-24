Ejercicio 1: Cuenta Digital :D

Cómo ejecutar
- Versión:Java 17
- Compilar: `javac *.java`
- Ejecutar: `java Main`

Decisiones de diseño
Mantuve los atributos como `private`. No agregué un `setSaldo()` porque permitiría cambiar el dinero saltándose las reglas. El saldo solo se modifica usando `depositar()` y `retirar()`, que hacen las validaciones y devuelven un booleano indicando el éxito o fallo.

Pruebas realizadas

Depósito correcto: Depositar $200 -> Aceptado (Saldo final: $1200)
Retiro correcto: Retirar $300 -> Aceptado (Saldo final: $900)
Monto no positivo: Depositar -$50 -> Rechazado (Saldo final: $900)
Fondos insuficientes: Retirar $2000 -> Rechazado (Saldo final: $900)

Sobre el Reto:
¿Qué agregué? 
Añadí el límite de retiro diario. Agregue las variables `limiteDiario` y `retiradoHoy`. En el Main agregué una prueba donde intento retirar $250. Aunque la cuenta tiene $900 de saldo, la operación se rechaza porque el usuario ya había retirado $300 antes y su límite diario es de $500.