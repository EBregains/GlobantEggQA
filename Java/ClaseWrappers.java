
import java.util.Scanner;

public class ClaseWrappers {
  public static void main(String[] args) {
    // Ejercicio1(); // Verificando si una cadena representa un número válido
    // Ejercicio2(); // Conversión de cadena a número
    // Ejercicio3(); // Verificando si una cadena contiene solo letras
    // Ejercicio4(); // Contando los espacios en blanco en una cadena
    // Ejercicio5(); // Suma de números
    // Ejercicio6(); // Contando los dígitos en un número
  }

  // Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un
  // número decimal usando Double.valueOf().
  // Si la cadena no representa un número válido, Double.valueOf() lanzará una
  // excepción. Captura esta excepción y muestra
  // un mensaje al usuario indicando que la entrada no es un número válido.
  public static void Ejercicio1() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, introduce una cadena:");
    String entrada = scanner.nextLine();

    try {
      double numero = Double.valueOf(entrada);
      System.out.println("La cadena introducida representa un número válido: " + numero);
    } catch (NumberFormatException e) {
      System.out.println("La cadena introducida no es un número válido.");
    }

    scanner.close();
  }

  // Escribe un programa que lea una cadena que represente un número entero como
  // entrada utilizando
  // la clase Scanner. Luego, convierte la cadena en un número entero utilizando
  // la clase de envoltura Integer.
  public static void Ejercicio2() {
    // Declarar Scanner
    Scanner teclado = new Scanner(System.in);
    // Imrimir instruccion al usuario
    System.out.println("Ingrese un numero entero:");
    String cadena = teclado.nextLine();
    // Envolver en try catch para que no se rompa
    try {
      Integer numero = Integer.valueOf(cadena);
      System.out.println("El numero ingresado convertido a Integer es: " + numero.toString());
    } catch (NumberFormatException e) {
      // Escribir que debe ingresar un numero.
      System.err.println("La cadena ingresada no representa un numero entero.");
    }
    // Cerramos scanner
    teclado.close();
  }

  // Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada
  // carácter en la cadena
  // y utiliza Character.isLetter() para verificar si todos los caracteres son
  // letras.
  // Muestra un mensaje al usuario indicando si la cadena contiene solo letras o
  // no.
  public static void Ejercicio3() {
    // Scanner
    Scanner teclado = new Scanner(System.in);
    // Instruccion al usuario
    System.out.println("Introduzca una cadena:");
    String cadena = teclado.nextLine();
    boolean sonTodasLetras = true;
    // Creamos bucle
    for (int i = 0; i < cadena.length(); i++) {
      if (!Character.isLetter(cadena.charAt(i))) {
        sonTodasLetras = false;
        break;
      }
    }
    if (sonTodasLetras)
      System.out.println("Efectivamente, son todas letras.");
    else
      System.out.println("No son todas letras.");
    // Cerramos Scanner
    teclado.close();
  }

  // Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada
  // carácter en la cadena y utiliza
  // Character.isWhitespace() para contar el número de espacios en blanco en la
  // cadena.
  // Muestra el recuento al usuario
  public static void Ejercicio4() {
    // Scanner
    Scanner teclado = new Scanner(System.in);
    // Instruccion al usuario
    System.out.println("Introduzca una cadena:");
    String cadena = teclado.nextLine();
    int espaciosEnBlanco = 0;
    // Creamos bucle
    for (int i = 0; i < cadena.length(); i++) {
      if (Character.isWhitespace(cadena.charAt(i))) {
        espaciosEnBlanco += 1;
      }
    }
    System.out.println("La cadena ingresada tiene " + espaciosEnBlanco + " espacios en blanco");
    // Cerramos Scanner
    teclado.close();
  }

  // Pídele al usuario que introduzca una cadena que represente un número entero y
  // luego otra cadena que represente
  // un número decimal. Convierte cada cadena al tipo de dato correspondiente
  // utilizando los métodos valueOf,
  // suma sus valores e imprímelos por consola.
  public static void Ejercicio5() {
    // Scanner
    Scanner teclado = new Scanner(System.in);
    // Instruccion al usuario
    System.out.println("Introduzca un numero entero:");
    String cadena1 = teclado.nextLine();
    int numeroEntero = Integer.valueOf(cadena1);
    System.out.println("Introduzca un numero decimal:");
    String cadena2 = teclado.nextLine();
    double numeroDecimal = Double.valueOf(cadena2);
    System.out.println("La suma de ambos numeros ingresados es: " + (numeroEntero + numeroDecimal));
    // Cerramos Scanner
    teclado.close();
  }

  // Pídele al usuario que introduzca un número. Convierte el número en una cadena
  // y luego utiliza un bucle
  // y Character.isDigit() para contar el número de dígitos en el número.
  public static void Ejercicio6() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    try {
      int numero = sc.nextInt();
      String cadenaNumero = String.valueOf(numero);
      int contador = 0;
      for (int i = 0; i < cadenaNumero.length(); i++) {
        char caracter = cadenaNumero.charAt(i);
        if (Character.isDigit(caracter)) {
          contador++;
        }
      }
      System.out.println("La cadena tiene " + contador + " digitos");
    } catch (Exception e) {
      e.printStackTrace();
    }
    sc.close();
  }
}