import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.print("Por favor, coloque a quantidade de frases que serão lidas: ");
      int quantityOfTests = scan.nextInt();
      scan.nextLine(); //Limpando o buffer de entrada

      String[] test = new String[quantityOfTests];

      System.out.print("Por favor, coloque as frases que serão lidas: ");
      for (int i = 0; i < quantityOfTests; i++) {
         test[i] = scan.nextLine();
      }

      StringBuilder result = new StringBuilder();

      for (String line : test) {
         int mid = line.length() / 2;
         String left = line.substring(0, mid);
         String right = line.substring(mid);
         result.append(new StringBuilder(left).reverse().toString());
         result.append(new StringBuilder(right).reverse().toString());
         result.append("\n");
      }

      String output = result.toString();
      System.out.println(output);

   }

}