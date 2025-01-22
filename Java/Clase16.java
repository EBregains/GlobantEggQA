import java.util.Arrays;
import java.util.Scanner;

public class Clase16 {
  public static void main(String[] args) {

    // scanner
    Scanner sc = new Scanner(System.in);

    // variables necesarias
    String oracion = "Como en un libro abierto, leo de tus pupilas en el fondo";
    int opcion = 0;

    // Menú
    do {
      System.out.println("\nMenú de opciones:");
      System.out.println("1. " + (oracion.isEmpty() ? "Crear oración" : "Borrar oración"));
      System.out.println("2. Cantidad de caracteres de la oración");
      System.out.println("3. Cantidad de palabras de la oración");
      System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
      System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
      System.out.println("6. Buscar palabra dentro de la oración");
      System.out.println("7. Modificar palabra dentro de la oración");
      System.out.println("8. Agregar contenido a la oración");
      System.out.println("9. Salir");

      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {

        // crear o borrar
        case 1:
          if (oracion.isEmpty()) {
            System.out.println("Ingrese una oración: ");
            oracion = sc.nextLine();
          } else {
            oracion = "";
            System.out.println("La oración ha sido eliminada.");
          }
          break;

        // contar caracteres
        case 2:
          if (oracion.isEmpty()) {
            System.out.println("Primero debe ingresar una oración.");
            break;
          }
          int cantidadCaracteres = oracion.length();
          System.out.println("La cantidad total de caracteres en la oración es: " + cantidadCaracteres);
          break;

        // contar palabras
        case 3:
          if (oracion.isEmpty()) {
            System.out.println("Primero debe ingresar una oración.");
            break;
          }
          String[] palabras = oracion.split(" ");
          System.out.println("La cantidad de palabras en la oración es: " + palabras.length);
          break;

        // ordenar palabras alfabeticamente
        case 4:
          if (oracion.isEmpty()) {
            System.out.println("Primero debe ingresar una oración.");
            break;
          }
          String oracionLwCs = oracion.toLowerCase();
          String[] palabrasLwCs = oracionLwCs.split(" ");
          Arrays.sort(palabrasLwCs);
          System.out.println(Arrays.toString(palabrasLwCs));
          break;

        case 5:
          if (oracion.isEmpty()) {
            System.out.println("Primero debe ingresar una oración.");
            break;
          }
          int posicion;
          palabras = oracion.split(" ");

          do {
            System.out
                .print("Ingrese un número entre 1 y " + palabras.length + " para saber a que palabra corresponde: ");
            while (!sc.hasNextInt()) {
              sc.next();
            }
            posicion = sc.nextInt();
          } while (posicion < 0 || posicion >= palabras.length);

          System.out.println("la palabra en la posición " + posicion + " es: " + palabras[posicion - 1]);

          break;

        // Buscar palabra dentro de la oración
        case 6:
          if (oracion.isEmpty()) {
            System.out.println("Primero debe ingresar una oración.");
            break;
          }
          System.out.println("Ingrese la palabra que desea buscar:");
          String palabraBuscada = sc.nextLine();
          palabrasLwCs = oracion.toLowerCase().split(" ");
          boolean palabraEncontrada = false;

          for (int i = 0; i < palabrasLwCs.length; i++) {
            if (palabrasLwCs[i].equals(palabraBuscada.toLowerCase())) {
              System.out.println("La palabra fue encontrada. Está en la posición: " + i + 1);
              palabraEncontrada = true;
            }
          }
          if (!palabraEncontrada) {
            System.out.println("La palabra no fue encontrada.");
          }
          break;

        case 7:
          System.out.println("Ingrese la palabra que desea modificar:");
          String palabraVieja = sc.nextLine();

          System.out.println("Ingrese la nueva palabra:");
          String palababraNueva = sc.nextLine();

          oracion = oracion.replaceAll(palabraVieja, palababraNueva);
          System.out.println(oracion.toString());
          break;

        case 8:
          if (oracion.isEmpty()) {
            System.out.println("Primero debe ingresar una oración.");
            break;
          }
          System.out.println("Ingrese informacion a agregar: ");
          String infoAAgregar = sc.nextLine();
          oracion += " " + infoAAgregar;

          break;
        case 9:
          System.out.println("Gracias por utilizar el programa. Adios!");
          break;
        default:
          System.out.println("Opcion no valida");
      }
      System.out.println("\nPresione una tecla para continuar..." + sc.next());
    } while (opcion != 9);

    sc.close();
  }
}