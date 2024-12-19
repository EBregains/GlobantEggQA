import java.util.Scanner;
import java.util.InputMismatchException;

public class Clase10 {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Ejercicio1(leer);
    Ejercicio2(leer);
    Ejercicio3(leer);
    Ejercicio4(leer);
    Ejercicio5(leer);
    // Complementario1(,leer);
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
    int[] arr = { 4, 6, 9 };
    Scanner scn = new Scanner(System.in);
    System.out.println("Ingrese un número entero: ");
    int numero = scn.nextInt();

    if (arr[0] == numero || arr[1] == numero || arr[2] == numero) {
      System.out.println("El número está presente dentro del array");
    } else {
      System.out.println("El número no se encuentra en el array");
    }
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
    int[] original = { 19, 07, 1997 };
    int[] agrandado = new int[original.length + 2];

    System.out.println("El arreglo original es: [ " + original[0] + ", " + original[1] + ", " + original[2] + " ]");

    agrandado[0] = original[0];
    agrandado[1] = original[1];
    agrandado[2] = original[2];

    try {
      System.out.println("Ingrese dos valores que seran agregados al arreglo original: ");
      System.out.print(" Numero 1 > ");
      agrandado[3] = leer.nextInt();
      System.out.print(" Numero 2 > ");
      agrandado[4] = leer.nextInt();

      System.out.println("El arreglo agrandado es: [ " + agrandado[0] + ", " + agrandado[1] + ", " + agrandado[2] + ", "
          + agrandado[3] + ", " + agrandado[4] + " ]");
    } catch (Exception e) {
      System.out.println("Hiciste algo mal, el programa exploto!");
    }
  }

  // Actividad: Ejercicios Complementarios
  // Generando un número aleatorio entre dos límites
  // Escribe un programa en el que se cree una variable de tipo array que contenga
  // seis elementos de tipo entero. El programa debe contar la cantidad
  // de elementos pares presentes en el array y mostrar el resultado por consola
  // utilizando solo las herramientas aprendidas hasta el momento.
  public static void Complementario1(Scanner leer) {
    try {
      int[] arreglo = new int[6];
      System.out.println("Ingrese el limite superior");
      int limiteSup = leer.nextInt();
      System.out.println("Ingrese el limite inferior");
      int limiteInf = leer.nextInt();
      int contadorPares = 0;

      for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] = (int) (Math.random() * (limiteSup - limiteInf + 1) + limiteInf);
        System.out.println(arreglo[i]);
        if (arreglo[i] % 2 == 0) {
          contadorPares++;
        }
      }
      System.out.println("La cantidad de número que son pares es: " + contadorPares);
    } catch (InputMismatchException e) {
      System.out.println("Error, el valor ingresado no es valido");
    } catch (Exception e) {
      System.out.println("ERROR!!!");
    }

  }

  // Sumando elementos en posiciones pares
  // Desarrolla un programa que cree un array de tamaño 5 que almacene números
  // enteros. Luego, suma los elementos ubicados en las posiciones pares del
  // array (es decir, las posiciones 0, 2 y 4) y muestra por consola el resultado
  // de la suma. Utiliza exclusivamente las herramientas aprendidas hasta el
  // momento.
  public static void Complementario2(Scanner leer) {

  }

  // Ordenando Nombres Alfabéticamente
  // Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres
  // serán ordenados alfabéticamente y posteriormente impresos en la consola.
  // Es esencial emplear exclusivamente las herramientas aprendidas hasta el
  // momento.
  public static void Complementario3(Scanner leer) {
    String[] nombres = new String[4];
    System.out.println("Ingrese nombres:");
    for (int i = 0; i < nombres.length; i++) {
      System.out.print("Nombre " + i + " > ");
      nombres[i] = leer.nextLine();
    }
  }
}