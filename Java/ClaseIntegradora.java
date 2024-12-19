import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseIntegradora {
  public static void main(String[] args) {
    // Desafio1();
    Desafio2();
  }

  // Escribe un programa que cumpla con las siguientes condiciones:
  // 1. Solicita al usuario ingresar una temperatura y una unidad de medida:
  // Celsius (C) o Fahrenheit (F).
  // 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado
  // en pantalla.
  // 3. El programa debe manejar al menos las siguientes situaciones:
  // Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
  // Si ingresa una temperatura no válida, mostrará un mensaje de error.
  static void Desafio1() {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.println("Ingrese una temperatura: ");
      double temp = sc.nextDouble();

      System.out.println("Ingrese la unidad de medida a la que quiere convertir (C/F)");
      String medida = sc.next();

      if (medida.equalsIgnoreCase("f")) {
        if (temp < -273.15) {
          throw new IllegalArgumentException(
              "Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
        }

        System.out.println(temp + " grados Celsius equivale a " + ((temp * 9 / 5) + 32) + " Fahrenheit");

      } else if (medida.equalsIgnoreCase("c")) {
        if (temp < -459.67) {
          throw new IllegalArgumentException(
              "Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
        }

        System.out.println(temp + " grados Fahrenheit equivale a " + ((temp - 32) * 5 / 9) + " Celsius");

      } else {
        throw new IllegalArgumentException(
            "Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
      }

    } catch (InputMismatchException e) {
      System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
    } catch (Exception e) {
      // System.out.println(e.GetMessage());
    }
  }

  // Escribe un programa que solicite al usuario que ingrese una contraseña y
  // verifique si cumple con los siguientes criterios para considerarse segura:
  // La contraseña debe tener al menos 8 caracteres.
  // La contraseña debe contener al menos una letra mayúscula y una letra
  // minúscula.
  // La contraseña debe contener al menos un número.
  // La contraseña debe contener al menos un carácter especial (por ejemplo, !, @,
  // #, $).
  static void Desafio2() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("-------------------------------------------------");
    System.out.println("Ingrese una contrasena que al menos cuente con: ");
    System.out.println(" - 8 caracteres.");
    System.out.println(" - Una Mayuscula y una Minuscula.");
    System.out.println(" - Un numero.");
    System.out.println(" - Un caracter especial.");
    System.out.println("-------------------------------------------------");
    System.out.print(" password > ");
    String password = teclado.nextLine(), errorMessage = "La contrasena presenta los siguientes errores: \n";
    int count = 0;

    if (password.length() < 8) {
      count++;
      errorMessage += "[" + count + "] no tiene al menos 8 caracteres\n";
    }

    if (!password.matches(".*[a-z].*")) {
      count++;
      errorMessage += "[" + count + "] no tiene al menos una minuscula\n";
    }

    if (!password.matches(".*[A-Z].*")) {
      count++;
      errorMessage += "[" + count + "] no tiene al menos una Mayuscula\n";
    }

    if (!password.matches(".*\\d.*")) {
      count++;
      errorMessage += "[" + count + "] no tiene al menos un numero\n";
    }

    if (!password.matches(".*[^a-z A-Z 0-9].*")) {
      count++;
      errorMessage += "[" + count + "] no tiene al menos un caracter especial\n";
    }

    if (count == 0) {
      errorMessage += "Excelente! Su nueva contrasena es: ************* (" + password + ")";
    } else {
      System.out.println(errorMessage);
    }

    teclado.close();
  }
}