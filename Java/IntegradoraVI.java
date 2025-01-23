import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegradoraVI {
  public static void main(String[] args) {
    int opcion;
    Scanner teclado = new Scanner(System.in);
    String[] nombres = { "Pablo", "Caro", "Emir" };
    double[] notas = { 9.95, 9.95, 9.95 };
    try {
      do {
        // Mostar Menu
        System.out.println("Seleccione una de las siguientes opciones");
        System.out.println("1.Registrar alumno");
        System.out.println("2.Mostrar todos los alumnos");
        System.out.println("3.Mostrar promedio de notas");
        System.out.println("4.Buscar alumno por nombre");
        System.out.println("5.Modificar nota por nombre");
        System.out.println("6.Eliminar alumno por nombre");
        System.out.println("7.Salir");
        // Leer la opcion del usuario
        opcion = teclado.nextInt();
        teclado.nextLine();

        // Declaracion de variables
        String nombreABuscar = "";
        boolean encontrado = false;
        switch (opcion) {
          case 1: // 1.Registrar alumno
            String nombre;
            do {
              System.out.print("Ingrese el nombre del alumno " + (nombres.length + 1) + ": ");
              nombre = teclado.nextLine();
              nombre = nombre.trim();
            } while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+"));
            double nota;
            do {
              System.out.print("Ingrese la nota del usuario " + (notas.length + 1) + " (del 1 al 10) : ");
              nota = teclado.nextDouble();
            } while (nota > 10 || nota < 0);
            nombres = Arrays.copyOf(nombres, nombres.length + 1);
            notas = Arrays.copyOf(notas, notas.length + 1);
            nombres[nombres.length - 1] = nombre;
            notas[notas.length - 1] = nota;

            System.out.println("El alumno " + nombres[nombres.length - 1] + " con nota " + notas[notas.length - 1]
                + " se cargo en el registro exitosamente. ");
            break;
          case 2: // Mostrar todos los alumnos

            for (int i = 0; i < nombres.length; i++) {
              System.out.println("El alumno " + nombres[i] + " tiene nota " + notas[i]);
            }

            break;
          case 3: // Mostrar promedio de notas

            double sumatoria = 0;
            for (int i = 0; i < notas.length; i++) {
              sumatoria = sumatoria + notas[i];
            }

            System.out.println("El promedio de notas es: " + (sumatoria / notas.length));

            break;
          case 4: // Buscar alumno por nombre
            System.out.println("Ingrese el nombre del alumno a buscar");
            nombreABuscar = teclado.nextLine();
            encontrado = false;

            for (int i = 0; i < nombres.length; i++) {
              if (nombres[i].equalsIgnoreCase(nombreABuscar)) {
                System.out.println("El alumno " + nombres[i] + " tiene la nota: " + notas[i]);
                encontrado = true;
              }
            }
            if (!encontrado) {
              System.out.println("El alumno " + nombreABuscar + " no se encuentra");
            }
            break;
          case 5: // Modificar nota por nombre
            System.out.println("Ingrese el nombre del alumno para modificar nota: ");
            nombreABuscar = teclado.nextLine();
            encontrado = false;

            for (int i = 0; i < nombres.length; i++) {
              if (nombres[i].equalsIgnoreCase(nombreABuscar)) {
                encontrado = true;
                System.out.println("Ingresar nueva nota: ");
                double nuevaNota = teclado.nextDouble();
                notas[i] = nuevaNota;
                System.out.println("La modificacion se realizo con exito.");

              }
            }

            if (!encontrado) {
              System.out.println("El alumno " + nombreABuscar + " no se encuentra");
            }

            break; // Eliminar alumno por nombre
          case 6:
            System.out.println("Ingrese el nombre del alumno a eliminar");
            nombreABuscar = teclado.nextLine();
            encontrado = false;

            for (int i = 0; i < nombres.length; i++) {
              if (encontrado) {
                nombres[i - 1] = nombres[i];
                notas[i - 1] = notas[i];
              }

              if (nombres[i].equalsIgnoreCase(nombreABuscar)) {
                encontrado = true;
              }
            }
            if (!encontrado) {
              System.out.println("No se encontró el nombre del alumno");
            } else {
              nombres = Arrays.copyOfRange(nombres, 0, nombres.length - 1);
              notas = Arrays.copyOfRange(notas, 0, notas.length - 1);
              System.out.println("Alumno eliminado con éxito");
            }

            break;
          case 7:
            System.out.println("Chau Goku, Para la eternidad!");
            break;
          default:
            System.out.println("Las opciones van del 1 al 7, viste...");
            break;
        }
      } while (opcion != 7);
      teclado.close();
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO Auto-generated catch block
      System.out.println("Intentaste ingresar a un indice del arreglo que no existe.");
    } catch (InputMismatchException e) {
      // TODO Auto-generated catch block
      System.out.println("El formato de lo ingresado no corresponde con lo pedido");
    }
  }
}
