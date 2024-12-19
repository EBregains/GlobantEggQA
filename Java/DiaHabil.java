// En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un día de la semana. El programa determinará si ese día es hábil o no. Se mostrará el resultado en pantalla. Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). Utilizaremos la estructura "switch" para implementar este programa. ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).)

import java.util.Scanner;

public class DiaHabil {

  public static void main(String[] args) {
    // Declarar un Scanner
    Scanner teclado = new Scanner(System.in);
    // Mostrar las opciones por pantalla
    System.out.println("Ingrese un dia de la semana del 1 al 7 empezando por Lunes: ");
    // Leer lo que ingrese por teclado
    int seleccion = teclado.nextInt();
    // Almacenar si es habil con una switch expression
    String esHabil = switch (seleccion) {
      case 1, 2, 3, 4, 5 -> "es habil.";
      case 6, 7 -> "no es habil.";
      default -> "no existe.";
    };
    // Mostrar por pantalla
    System.out.println("El dia " + esHabil);
    // Cerrarlo
    teclado.close();
  }

}
