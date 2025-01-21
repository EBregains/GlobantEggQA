import java.util.Scanner;

public class IntegradoraIV {
  public static void main(String[] args) {
    // CalculoFactorial();
    FibonacciMejorado();
    // DibujarCuadrados();
    // GraficoDeBarras();
    // NumerosPrimos();
  }

  // ✏️ Actividad: Cálculo del factorial
  // El objetivo de esta actividad es que desarrolles un programa que solicite al
  // usuario ingresar un número y posteriormente calcule su factorial mediante un
  // bucle do-while. El factorial de un número se define como el producto de todos
  // los enteros desde 1 hasta ese número. A continuación, te presentamos algunos
  // ejemplos para mayor claridad:
  // El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.
  // El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como
  // resultado 120.
  // Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que
  // da 5040.

  public static void CalculoFactorial() {
    // Declarar un scnaner
    try {
      Scanner teclado = new Scanner(System.in);
      int numero;
      do {
        // Imprimir en consola una instruccion al usuario
        System.out.println("Ingrese un numero positivo para calcular su factorial: ");
        // Guardar lo que el usuario ingrese
        numero = teclado.nextInt();
        if (numero < 0) {
          System.out.println("El numero debe ser mayor o igual a 0");
        }
      } while (numero < 0);
      // Recorrer en bucle el numero multiplicandolo
      long resultado = 1;
      while (numero > 0) {
        resultado *= numero;
        numero--;
      }
      System.out.println("El factorial es: " + resultado);
      teclado.close();
    } catch (Exception e) {
      System.out.println("Che capo, te pedi un numero.");
    }
  }

  public static void FibonacciMejorado() {
    Scanner input = new Scanner(System.in);
    System.out.println("Por favor ingrese la posicion");
    int posicion = input.nextInt();
    while (posicion < 0) {
      System.out.print("Por favor, ingresa una posición positiva: ");
      posicion = input.nextInt();
    }
    // Definir posicion 0,1 y resultado
    int posAnterior = 0; // Valor para posición 0
    int posActual = 1; // Valor para posición 1
    int resultado = 0;
    if (posicion == 0) {
      resultado = posAnterior;
    } else if (posicion == 1) {
      resultado = posActual;
    }
    for (int i = 2; i <= posicion; i++) {
      resultado = posAnterior + posActual;
      posAnterior = posActual;
      posActual = resultado;
    }

    // Mostrar el resultado
    System.out.println("El número en la posición " + posicion + " de la serie de Fibonacci es: " + resultado);

    input.close();
  }

  public static void NumerosPrimos() {
    Scanner input = new Scanner(System.in);

    // Solicitar al usuario la cantidad de números primos que desea
    System.out.print("¿Cuántos números primos deseas obtener?: ");
    int cantidadPrimos = input.nextInt();

    // Variables para controlar los números primos generados
    int contadorPrimos = 0; // Cantidad de primos encontrados
    int numero = 2; // Número que se evaluará si es primo

    System.out.println("Los primeros " + cantidadPrimos + " números primos son:");

    // Bucle principal para encontrar los números primos
    while (contadorPrimos < cantidadPrimos) {
      if (esPrimo(numero)) {
        System.out.print(numero + " ");
        contadorPrimos++;
      }
      numero++;
    }
    input.close();
  }

  // Método para verificar si un número es primo
  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Realiza un programa para crear un cuadrado de N elementos por lado utilizando
  // el carácter “*”.
  // Para ello simplemente dibuja una línea de N asteriscos. Repite este proceso N
  // veces para completar el cuadrado.
  // Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
  // siguiente

  // * * * *
  // * *
  // * *
  // * * * *
  public static void DibujarCuadrados() {

    Scanner tecladinho = new Scanner(System.in);
    System.out.print("Ingrese el tamanho del cuadrado a generar: ");
    int tamanho = tecladinho.nextInt();
    for (int i = 0; i < tamanho; i++) {
      for (int j = 0; j < tamanho; j++) {
        if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    tecladinho.close();
  }

  /*
   * Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20.
   * Luego, imprime una representación visual de estos números en forma de gráfico
   * de barras utilizando asteriscos. Cada número ingresado corresponderá a la
   * longitud de una barra en el gráfico, donde cada asterisco representa una
   * unidad en la escala. A modo de ejemplo:
   * 
   * 2**
   * 5*****
   * 1*
   * 4****
   */
  public static void GraficoDeBarras() {
    int[] numeros = new int[4];
    Scanner sc = new Scanner(System.in);
    int cantNumeros = 0;
    do {
      do {
        System.out.println("Ingresar numero " + (cantNumeros + 1) + ": ");
        numeros[cantNumeros] = sc.nextInt();
      } while (numeros[cantNumeros] < 1 || numeros[cantNumeros] > 20);
      cantNumeros++;
    } while (cantNumeros <= 3);

    for (int i = 0; i < 4; i++) {
      System.out.print(numeros[i] + ": ");
      for (int j = 0; j < numeros[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }
}
