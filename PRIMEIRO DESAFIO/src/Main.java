import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Por favor, coloque a quantidade de números que serão lidos: ");

      // Recebe o número de valores a serem lidos
      int quantityOfValues = sc.nextInt();

      // Cria um array para armazenar os valores
      int[] values = new int[quantityOfValues];
      for (int i = 0; i < quantityOfValues; i++) {
         values[i] = sc.nextInt();
      }

      // Ordena todos os valores em ordem crescente
      Arrays.sort(values);

      System.out.println();
      System.out.println("Os pares em ordem crescente: ");

      for (int value : values) {
         if (value % 2 == 0) {
            System.out.println(value);
         }
      }

      System.out.println();
      System.out.println("Os ímpares em ordem decrescente: ");

      for (int i = values.length - 1; i >= 0; i--) {
         if (values[i] % 2 != 0) {
            System.out.println(values[i]);
         }
      }
   }
}