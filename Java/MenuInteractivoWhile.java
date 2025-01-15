import java.util.Scanner;

public class MenuInteractivoWhile {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int opcion = 0;

    while (opcion != 5) {

      System.out.println("\nOpciones:  ");
      System.out.println("1. Comprar producto.");

      System.out.println("2. Realizar devolución.");

      System.out.println("3. Ver mis pedidos.");

      System.out.println("4. Preguntas frecuentes.");

      System.out.println("5. Salir.");

      try {
        System.out.print("Ingrese la opción deseada:  ");
        opcion = teclado.nextInt();
      } catch (Exception e) {
        // TODO Auto-generated catch block
        opcion = 0;
        break;
      }

      switch (opcion) {
        case 1:
          System.out.println("Usted ha seleccionado la opción 1");
          break;

        case 2:
          System.out.println("Usted ha seleccionado la opción 2");
          break;

        case 3:
          System.out.println("Usted ha seleccionado la opción 3");
          break;

        case 4:
          System.out.println("Usted ha seleccionado la opción 4");
          break;

        case 5:
          System.out.println("Hasta luego, nos volverremos a ver...");
          break;

        default:
          System.out.println("Ha ingresado una opción no válida, por favor ingrese una nuevamente");
          break;
      }
    }

    teclado.close();

  }
}
