import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ClaseArrays {
  public static void main(String[] args) {
    Ejercicio1(); // Actividad: Ordenar en forma descendente
    Ejercicio2(); // Actividad: Búsqueda binaria
    Ejercicio3(); // Actividad: Comparando arreglos
    Ejercicio4(); // Actividad: Copiando parte de un arreglo.
  }

  // Escribe un programa en el que declares una variable de tipo array que
  // contenga 10 elementos
  // de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100,
  // imprime por
  // consola el arreglo inicial y luego ordenalo en forma descendente utilizando
  // el método
  // Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
  public static void Ejercicio1() {
    Random rand = new Random();
    Integer[] array = new Integer[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(101) + 1;
    }
    System.out.println("Array inicial:");
    System.out.println(Arrays.toString(array));

    Arrays.sort(array, Collections.reverseOrder());
    System.out.println("Array ordenado en forma descendente:");

    System.out.println(Arrays.toString(array));
  }

  // La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en
  // una lista ordenada de elementos.
  // La clase Arrays ya incluye su implementación mediante el método
  // binarySearch().
  // Escribe un programa que realice una búsqueda binaria en un arreglo ordenado
  // de enteros
  // utilizando el método Arrays.binarySearch(). El programa debe imprimir el
  // arreglo generado originalmente,
  // solicitar al usuario el valor buscado e imprimir el índice del valor buscado
  // si está presente en el arreglo.
  public static void Ejercicio2() {
    int[] arreglo = new int[7];
    Random generador = new Random();
    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = generador.nextInt(20);
    }
    System.out.println("El array sin orden es " + Arrays.toString(arreglo));
    Arrays.sort(arreglo);
    System.out.println("El array ordenenado es " + Arrays.toString(arreglo));
    System.out.println("Ingrese por favor que numero desea buscar: ");
    Scanner numero = new Scanner(System.in);
    int buscado = numero.nextInt();
    int posicion = Arrays.binarySearch(arreglo, buscado);
    if (posicion < 0) {
      System.out.println("El número ingresado no fue encontrado en la cadena. ");
    } else {
      System.out.println("El número ingresado se encuentra en la posición: " + posicion);
    }
    numero.close();
  }

  // Escribe un programa que compare dos arreglos de enteros utilizando el método
  // Arrays.equals().
  // El programa debe imprimir si los arreglos son iguales o no.
  public static void Ejercicio3() {

    int[] arr1 = new int[5];
    int[] arr2 = new int[5];

    Random rand = new Random();
    // primer array random
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = rand.nextInt(100);
    }

    Scanner sc = new Scanner(System.in);
    // segundo array pedido al usuario
    for (int i = 0; i < arr2.length; i++) {
      System.out.println("Ingrese un numero entero del 1 al 100 por favor: ");
      arr2[i] = sc.nextInt();
    }
    sc.close();

    // Se imprimen 2 arrays desordenados
    System.out.println("Array 1 desordenado: " + Arrays.toString(arr1));
    System.out.println("");
    System.out.println("Array 2 desordenado: " + Arrays.toString(arr2));
    System.out.println("");
    // Usamos el sort para ordenar ambos arrays
    Arrays.sort(arr1);
    System.out.println("Array 1 ordenado: " + Arrays.toString(arr1));
    Arrays.sort(arr2);
    System.out.println("Array 2 ordenado: " + Arrays.toString(arr2));
    // Validacion de igualdad de arrays
    boolean isEqual = Arrays.equals(arr1, arr2);

    if (isEqual) {
      System.out.println("Los arreglos son iguales");
    } else {
      System.out.println("Los arreglos son distintos");
    }
  }

  // Crea un programa en Java que declare y muestre un arreglo de enteros junto
  // con sus índices.
  // Luego, solicita al usuario dos índices: un índice inicial y un índice final.
  // Con estos dos índices,
  // copia la parte del arreglo original comprendida entre ellos (inclusive) en un
  // nuevo arreglo utilizando
  // el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para
  // confirmar que el índice inicial
  // es menor que el índice final y que ambos índices están dentro del rango
  // válido del arreglo original.
  // Finalmente, imprime el nuevo arreglo por consola.
  public static void Ejercicio4() {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int[] array = new int[rand.nextInt(8) + 3];
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(4);
    }
    System.out.println("EL array es:");
    System.out.println(Arrays.toString(array));
    System.out.println("Los indices son: ");
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        System.out.println((i + 1) + "]");
      } else {
        System.out.print((i + 1) + ", ");
      }
    }

    System.out.println(
        "Ingrese el rango desde el que quiere ver el array \n Empezando por el menor indice y terminando con el mayor indice");
    System.out.print("Inserte el indice menor --->");
    int indMenor = scan.nextInt();
    System.out.print("Inserte el indice mayor --->");
    int indMayor = scan.nextInt();

    while (indMayor < indMenor || indMayor > array.length || indMenor < 0 || indMenor > array.length) {
      System.out.println("Ingrese un rango valido");
      System.out.print("Inserte el indice menor --->");
      indMenor = scan.nextInt();
      System.out.print("Inserte el indice mayor --->");
      indMayor = scan.nextInt();
    }

    System.out.println("El rango solicitado es ");
    System.out.print("[");
    for (int i = indMenor - 1; i <= indMayor - 1; i++) {
      if (i == indMayor - 1) {
        System.out.println(array[i] + "]");
      } else {
        System.out.print(array[i] + ", ");
      }
    }

  }

  // El método fill() de la clase Arrays cambia todos los elementos en un arreglo
  // por un valor estático,
  // desde el índice start (por defecto 0) hasta el índice end (por defecto
  // array.length) y devuelve el arreglo
  // modificado. Vamos a escribir un programa que solicite al usuario el tamaño
  // para un arreglo y un número entero
  // con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill().
  // Finalmente, imprime el arreglo resultante.
  public static void Ejercicio5() {
    // Creamos el Scanner
    Scanner teclado = new Scanner(System.in);
    // Declaramos un arreglo vacio para despues redimensionarlo
    int[] arreglo = {};
    // Pedimos los valores
    System.out.println("Ingrese el tamanho del arreglo:");
    int tamanho = teclado.nextInt();
    System.out.println("Con que numero desea rellenarlo? ");
    int numero = teclado.nextInt();
    // Redimension
    arreglo = Arrays.copyOf(arreglo, tamanho);
    // Rellenamos
    Arrays.fill(arreglo, numero);
    System.out.println("El arreglo obtenido es el siguiente: " + Arrays.toString(arreglo));
    teclado.close();
  }

  public static void Ejercicio6() {

    Scanner scan = new Scanner(System.in);
    System.out.println("De que tamaño quieres el array?");
    int tam = scan.nextInt();
    int[] array = new int[tam];
    int start = 0;
    int ind;

    do {
      System.out.println("Con qué número entero deseas rellenar el array?");
      int num = scan.nextInt();
      System.out.println("Hasta que indice desea rellenar el array con el numero");
      System.out.print("----->");
      ind = scan.nextInt();
      while (ind > array.length || ind < 0) {
        System.out.println("Ingresa un numero valido");
        ind = scan.nextInt();

      }
      Arrays.fill(array, start, ind, num);

      if (ind > start) {
        start = ind;
      }

    } while (ind != array.length);
    System.out.println("Tu Array ha quedado asi: ");
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        System.out.println(array[i] + "]");
      } else {
        System.out.print(array[i] + ", ");

      }
    }
  }
}
