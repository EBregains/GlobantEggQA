import java.util.Scanner;

public class Complementario1 {

  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);
      System.out.print("Ingrese una cadena de caracteres: ");
      String cadena = input.nextLine();
      System.out.print("Ingrese el primer indice: ");
      int primero = input.nextInt();
      System.out.print("Ingrese el segundo indice: ");
      int segundo = input.nextInt();
      System.out.print("La cadena original es: " + cadena + "\n");
      System.out.print("La subcadena es: " + cadena.substring(primero, segundo));
      input.close();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Ups, Ingresaste un array mas grande que la frase!");
    } catch (Error e) {
      System.out.println("Ups, te la mandaste!");
    }
  }
}
