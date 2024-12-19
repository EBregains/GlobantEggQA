// Actividad: Conversión de Cadena a Entero
// Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.

import java.util.Scanner;

public class CadenaAEntero {
  public static void main(String[] args) {
    try {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese un numero:");
      String input = teclado.nextLine();
      System.out.println("Tu numero es: " + Integer.parseInt(input));
      teclado.close();
    } catch (NumberFormatException error) {
      System.out.println("No se ingreso un numero");
    } catch (Exception error) {
      System.out.println("Error: Ups!");
    }
  }
}
