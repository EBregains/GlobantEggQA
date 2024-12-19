import java.util.Scanner;

public class ClaseMath {
  public static void main(String[] args) {
    // Ejercicio1();
    // Ejercicio2();
    // Ejercicio3();
    // Ejercicio4();
    // Ejercicio5();
    // Complementario1();
    Complementario2();
  }

  // Escribe un programa que pida al usuario dos números enteros, representando la
  // base y el exponente,
  // y calcula el resultado de elevar la base al exponente utilizando el método
  // pow() de la clase Math.
  // Muestra el resultado en pantalla.
  public static void Ejercicio1() {
    Scanner miScanner = new Scanner(System.in);
    System.out.println("Ingrese un número entero: ");
    int num = miScanner.nextInt();
    int absNum = Math.abs(num);
    System.out.println(absNum);
  }

  // Actividad: Redondeo de números
  // Escribe un programa que pida al usuario un número decimal y muestra en
  // pantalla su valor redondeado
  // utilizando el método round() de la clase Math.
  public static void Ejercicio2() {
    Scanner miScanner = new Scanner(System.in);
    System.out.println("Ingrese un número decimal: ");
    float num = miScanner.nextFloat();
    System.out.println(Math.round(num));
  }

  // Escribe un programa que genere y muestre en pantalla un número aleatorio en
  // el rango del 1 al 355
  // utilizando el método random() de la clase Math. Puedes utilizar el método
  // floor() para redondear
  // el número aleatorio hacia abajo.
  public static void Ejercicio3() {
    double numAleatorio = Math.random() * 355 + 1;
    double numeroRedondeado = Math.floor(numAleatorio);
    System.out.println(numeroRedondeado);
  }

  // Escribe un programa que pida al usuario dos números enteros, representando la
  // base y el exponente,
  // y calcula el resultado de elevar la base al exponente utilizando el método
  // pow() de la clase Math.
  // Muestra el resultado en pantalla.
  public static void Ejercicio4() {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un número base: ");
    int base = leer.nextInt();
    System.out.println("Ingrese un número exponente: ");
    int exponente = leer.nextInt();
    int resultado = (int) Math.pow(base, exponente);
    System.out.println("El resultado de la potencia es: " + resultado);
  }

  // Escribe un programa que pida al usuario un número positivo y calcule su raíz
  // cuadrada utilizando el
  // método sqrt() de la clase Math. Si el número ingresado es negativo, muestra
  // un mensaje
  // adecuado en pantalla.
  public static void Ejercicio5() {
    Scanner teclado = new Scanner(System.in);
    try {
      System.out.print("Ingrese un numero positivo y calcularemos su raiz cuadrada: ");
      int numero = teclado.nextInt();
      if (numero < 0) {
        System.out.println("No te pases de vivo. Solo numeros positivos");
      } else {
        System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numero));
      }

    } catch (Exception e) {
      System.out.println("No te pases de vivo. Solo aceptamos numeros. " + e.getMessage());
    }
    teclado.close();
  }

  // Escribe un programa que pida al usuario ingresar dos números enteros: un
  // límite inferior
  // y un límite superior. Luego, utiliza el método random() de la clase Math para
  // generar y
  // mostrar en pantalla un número aleatorio dentro del rango especificado por los
  // límites ingresados.
  public static void Complementario1() {
    Scanner miScanner = new Scanner(System.in);
    System.out.println("ingrese el limite superior");
    int limiteSup = miScanner.nextInt();// 5
    System.out.println("Ingrese el limite inferior");
    int limiteInf = miScanner.nextInt();// 7
    int aux = 0;
    if (limiteSup < limiteInf) {
      aux = limiteInf;// 7
      limiteInf = limiteSup;// 5
      limiteSup = aux;// 7
    }

    int numAleatorio = (int) (Math.random() * (limiteSup - limiteInf + 1) + limiteInf);
    System.out.println("El número aleatorio es: " + numAleatorio);
    miScanner.close();
  }

  // Escribe un programa que cumpla con las siguientes condiciones:

  // Pide al usuario que ingrese un número entre 1 y 30. Este número será
  // almacenado en una variable llamada numeroLimite .
  //
  // Utiliza la clase Math para generar un número aleatorio entre 1 y el
  // numeroLimite recibido del usuario.
  // Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número
  // aleatorio generado y muéstralo en pantalla.
  // Analiza si el número aleatorio generado es primo y muestra un mensaje en
  // pantalla indicando si lo es o no.
  // Finalmente, muestra el número aleatorio generado y su raíz cuadrada en
  // pantalla.

  public static void Complementario2() {
    // Pide al usuario que ingrese un número entre 1 y 30. Este número será
    // almacenado en una variable llamada numeroLimite.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número entre 1 y 30:");
    int numeroLimite = teclado.nextInt();

    // Utiliza la clase Math para generar un número aleatorio entre 1 y el
    // numeroLimite recibido del usuario.
    int numeroAleatorio = (int) (Math.random() * numeroLimite + 1);

    // Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número
    // aleatorio generado y muéstralo en pantalla.
    double raiz = Math.sqrt(numeroAleatorio);
    System.out.println("La raíz cuadrada de: " + numeroAleatorio + " es: " + raiz);

    // Analiza si el número aleatorio generado es primo y muestra un mensaje en
    // pantalla indicando si lo es o no.
    String esPrimo = EsPrimo(numeroAleatorio) ? "es un numero primo" : "no es un numero primo";
    System.out.println("El numero " + numeroAleatorio + " " + esPrimo);

    teclado.close();

  }

  public static boolean EsPrimo(int n) {

    if (n <= 1) {
      return false;
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}