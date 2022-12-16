import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Por favor, insira a quantidade de números inteiros: ");
      // Recebe o tamanho do array
      int quantityOfValues = scanner.nextInt();

      System.out.print("Por favor, insira o número alvo: ");
      // Recebe o valor alvo
      int target = scanner.nextInt();

      int[] arr = new int[quantityOfValues];

      System.out.print("Por favor, insira os números: ");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = scanner.nextInt();
      }

      // Conta o número de pares que satisfazem o critério.
      int count = 0;

      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (Math.abs(arr[i] - arr[j]) == target) {
               count++;
            }
         }
      }

      System.out.println();
      System.out.println("Números de pares: " + count);
   }
}
