import java.util.Scanner;
import java.util.InputMismatchException;

public class Clase10 {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Ejercicio1(leer);
    Ejercicio2(leer);
    Ejercicio3(leer);
    leer.close();
  }

  // Actividad: Sumando elementos
  // Escribe un programa en el cual se cree una variable de tipo array que
  // contenga tres elementos de tipo entero.
  // El programa debe sumar los tres elementos de forma manual e imprimir por
  // consola el resultado utilizando
  // solamente las herramientas adquiridas hasta el momento.
  public static void Ejercicio1(Scanner leer) {
    try {
      int[] arregloEnteros = new int[3];
      System.out.println("Ingrese el primer número entero:");
      arregloEnteros[0] = leer.nextInt();
      System.out.println("Ingrese el segun número entero:");
      arregloEnteros[1] = leer.nextInt();
      System.out.println("Ingrese el tercer número entero:");
      arregloEnteros[2] = leer.nextInt();
      System.out.println(
          "La suma de los 3 número ingresados es: " + (arregloEnteros[0] + arregloEnteros[1] + arregloEnteros[2]));
    } catch (InputMismatchException e) {
      System.out.println("Error!!!, ingrese un número entero");
    } catch (Exception e) {
      System.out.println("ERROR!!!!");
    }
  }

  // Actividad: Promediando elementos
  // Escribe un programa en el cual se cree una variable de tipo array que
  // contenga cuatro elementos de tipo entero.
  // Estos elementos deben ser ingresados por el usuario.
  // El programa debe sumar y promediar los cuatro elementos de forma manual e
  // imprimir por consola el resultado,
  // utilizando solamente las herramientas adquiridas hasta el momento.
  public static void Ejercicio2(Scanner leer) {
    int[] arreglo = new int[4];
    int suma = 0;
    double promedio;
    int i;

    for (i = 0; i < 4; i++) {
      System.out.println("Ingrese un número");
      arreglo[i] = leer.nextInt();
      suma += arreglo[i]; // suma = suma + arreglo[i]
    }

    promedio = suma / 4.0;

    System.out.println("La suma total es: " + suma);
    System.out.println("El promedio de los valores es: " + promedio);
  }

  // Actividad: Encontrando el máximo
  // Escribe un programa en el cual se cree una variable de tipo array que
  // contenga cinco elementos de tipo entero,
  // ingresados por el usuario. El programa debe buscar el máximo e imprimir por
  // consola el resultado utilizando
  // solamente las herramientas adquiridas hasta el momento.
  public static void Ejercicio3(Scanner leer) {
    try {
      int[] array = new int[5];
      int i;
      int valorMaximo = 0;

      for (i = 0; i < 5; i++) {
        System.out.println("Ingrese un número");
        array[i] = leer.nextInt();

        if (valorMaximo < array[i] || i == 0) {
          valorMaximo = array[i];
        }
      }

      System.out.println("El valor máximo es: " + valorMaximo);
    } catch (Exception e) {
      System.out.println("Error!");
    }
  }

  // Actividad: Buscando un elemento
  // El programa debe crear un array de tamaño 3 que almacene números enteros.
  // Luego, solicita un número al usuario
  // y muestra por consola si ese número está presente en el array o no. Es
  // importante utilizar únicamente las herramientas
  // aprendidas hasta el momento, sin emplear bucles en el proceso.
  public static void Ejercicio4(Scanner leer) {

  }

  // Actividad: Copiando elementos
  // Desarrolla un programa que inicie creando un array de 3 enteros, con valores
  // predeterminados.
  // Posteriormente, genera una copia del mismo con una extensión de 2 elementos
  // adicionales.
  // Solicita al usuario que ingrese dos números para ser almacenados en las
  // nuevas posiciones del array.
  // Finalmente, muestra por consola el contenido del nuevo array.
  // Es esencial emplear exclusivamente las herramientas aprendidas hasta el
  // momento, evitando el uso de bucles en el proceso.
  public static void Ejercicio5(Scanner leer) {

  }

}