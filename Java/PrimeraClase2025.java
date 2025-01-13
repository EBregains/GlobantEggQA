public class PrimeraClase2025 {
  public static void main(String[] args) {
    // ejercicio1();
    // ejercicio1();
    // ejercicio1();
    // ejercicio1();
    // ejercicio1();
    ejercicio06();
  }

  public static void ejercicio01() {

    int[] array1 = { 1, 2, 3 };

    System.out.println("Aquí los tienes bb: ");

    for (int numb : array1) {
      System.out.println(numb);
    }
  }

  public static void ejercicio02() {

    int[] array1 = { 3, 10, 2, 500, 15, 60 };
    int minimo = array1[0];

    for (int i = 0; i < array1.length; i++) {
      if (array1[i] < minimo) {
        minimo = array1[i];
      }

    }
    System.out.println("Mor, el menor es: " + minimo);
  }

  public static void ejercicio03() {
    int[] arreglo = { 1, 2, 3, 43, 54, 6, 722, 56, 8 };
    for (int i = arreglo.length - 1; i >= 0; i--) {
      System.out.println(arreglo[i]);
    }
  }

  public static void ejercicio04() {
    int[] arreglo = { 1, 2, 3, 43, 54, 6, 722, 56, 8 };
    // int temporal = 0;
    int[] arregloInvertido = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
      arregloInvertido[arreglo.length - i - 1] = arreglo[i];
    }
    for (int num : arregloInvertido) {
      System.out.println(num);
    }
  }

  public static void ejercicio05() {
    int[] arreglo = { 1, 2, 3, 43, 54, 6, 722, 56, 8 };
    System.out.print(arreglo[0] + " ");
    for (int i = 1; i < arreglo.length; i++) {
      arreglo[i] = arreglo[i] + arreglo[i - 1];
      System.out.print(arreglo[i] + " ");
    }
  }

  // Escribe un programa que genere un array de 10 elementos de tipo entero.
  // Inicializa cada elemento con un número aleatorio menor a 100 y luego imprime
  // todos los elementos del array en una única línea. Posteriormente, recorre el
  // array para contar los elementos pares y muestra el total en la consola.
  public static void ejercicio06() {
    int[] arreglo = new int[10];
    int cantidadNumerosPares = 0;
    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = (int) (Math.floor(Math.random() * 100));
      System.out.print(arreglo[i] + " | ");
      if (arreglo[i] % 2 == 0)
        cantidadNumerosPares++;
    }
    System.out.println();
    System.out.println("La cantidad de numeros pares es: " + cantidadNumerosPares);
  }
}
