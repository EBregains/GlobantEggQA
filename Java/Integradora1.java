import java.util.Scanner;
import java.util.Arrays;

public class Integradora1 {
  public static void main(String[] args) {
    Ejercicio1();
    // Ejercicio2();
  }

  // Actividad: Generando contraseñas
  // Vas a desarrollar un programa en Java que genere una contraseña aleatoria.
  // Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras
  // minúsculas y dígitos. La contraseña será almacenada en un arreglo de
  // caracteres.
  // Para generar la contraseña, utilizarás un bucle for que repetirá la operación
  // tantas veces como la longitud de la contraseña especificada por el usuario.
  // Para asegurarte de que la contraseña generada contenga al menos una letra
  // mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while
  // junto con los métodos isUpperCase, isLowerCase e isDigit de la clase
  // Character.
  // Finalmente, convertirás el arreglo de caracteres en un String con un bucle
  // for y luego imprimirás la contraseña generada en la consola.
  public static void Ejercicio1() {

    try {
      // Generear un Scanner
      Scanner teclado = new Scanner(System.in);
      int longitud;
      do {
        // Imprimir una instruccion
        System.out.println("Ingrese la longitud de la contrasenha a generar (minimo 3): ");
        // Leer lo que haya ingresado
        longitud = teclado.nextInt();
      } while (longitud <= 3);
      // Generamos el arreglo
      char[] claveChars = new char[longitud];
      // Recorremos arreglo para generar characteres
      boolean hasDigit, hasUppercase, hasLowercase;
      do {
        hasDigit = false;
        hasUppercase = false;
        hasLowercase = false;
        for (int i = 0; i < claveChars.length; i++) {
          char character;
          do {
            character = (char) (Math.random() * 75 + 48);
          } while ((character >= 58 && character <= 64) || (character >= 91 && character <= 96));
          claveChars[i] = character;
          if (Character.isDigit(character))
            hasDigit = true;
          if (Character.isUpperCase(character))
            hasUppercase = true;
          if (Character.isLowerCase(character))
            hasLowercase = true;
          System.out.print(character);
        }
        System.out.println();
      } while (!hasDigit || !hasLowercase || !hasUppercase);

      String clave = "";
      for (int i = 0; i < claveChars.length; i++) {
        clave += claveChars[i];
      }
      System.out.println("La clave generada es: " + clave);
      teclado.close();
    } catch (Exception e) {
      System.out.println("Che capo, te pedi un numero.");
    }
  }

  // Vas a desarrollar un programa en Java que genere un arreglo de calificaciones
  // de manera aleatoria. Estas calificaciones se almacenarán en un arreglo de
  // Strings.
  // Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos,
  // separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y
  // excelente (>=10). Necesitarás convertir los String a double para lograrlo.
  // Luego calcula el promedio del arreglo original y de cada uno de los nuevos
  // arreglos.
  // Por último, imprimiré los resultados en consola.
  public static void Ejercicio2() {

    int tamañoArreglo = 10;

    String[] calificaciones = new String[tamañoArreglo];
    // Genera califaciones aleatorias 1-10
    for (int i = 0; i < calificaciones.length; i++) {
      double calificacion = Math.random() * 10 + 1;
      System.out.println(calificacion);
      calificaciones[i] = String.valueOf(calificacion);
    }

    String[] desaprobado = new String[0];
    String[] aprobado = new String[0];
    String[] excelente = new String[0];

    for (String nota : calificaciones) {
      double calificacion = Double.parseDouble(nota);

      if (calificacion < 4) {
        desaprobado = Arrays.copyOf(desaprobado, desaprobado.length + 1);
        desaprobado[desaprobado.length - 1] = nota;
      } else if (calificacion < 10) {
        aprobado = Arrays.copyOf(aprobado, aprobado.length + 1);
        aprobado[aprobado.length - 1] = nota;
      } else {
        excelente = Arrays.copyOf(excelente, excelente.length + 1);
        excelente[excelente.length - 1] = nota;
      }
    }
    System.out.println("El promedio del arreglo completo es: " + CalcularPromedios(calificaciones));
    System.out.println("El promedio de los desaprobados es: " + CalcularPromedios(desaprobado));
    System.out.println("El promedio de los aprobados es: " + CalcularPromedios(aprobado));
    System.out.println("El promedio de los excelentes es: " + CalcularPromedios(excelente));
  }

  public static double CalcularPromedios(String[] calificaciones) {
    if (calificaciones.length == 0) {
      return 0;
    }
    double respuesta = 0;
    for (int i = 0; i < calificaciones.length; i++) {
      respuesta += Double.parseDouble(calificaciones[i]);
    }
    respuesta = respuesta / calificaciones.length;
    return respuesta;
  }
}
