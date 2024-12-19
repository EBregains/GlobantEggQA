// 1. Pide al usuario que ingrese dos números, y:
// A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado. Debería verse así:
// B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
// C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese numero a: ");

    int a = teclado.nextInt();
    System.out.print("Ingrese numero b: ");
    int b = teclado.nextInt();
    String esMayor = a > b ? "Si" : "No";
    System.out.println("El numero " + a + " es mayor a " + b + "? " + esMayor);

    teclado.close();
  }
}