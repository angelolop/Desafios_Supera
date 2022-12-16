import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      // Classe para colocar o ambiente nos Estados Unidos, trocando assim a vírgula(,) para ponto(.)
      Locale.setDefault(Locale.US);

      Scanner scanner = new Scanner(System.in);

      // Recebe o valor de ponto flutuante com duas casas decimais.
      System.out.print("Por favor, coloque um valor monetário: ");
      double value = scanner.nextDouble();

      // Calcula as notas e as moedas
      int num100 = (int) (value / 100);
      value -= num100 * 100;
      int num50 = (int) (value / 50);
      value -= num50 * 50;
      int num20 = (int) (value / 20);
      value -= num20 * 20;
      int num10 = (int) (value / 10);
      value -= num10 * 10;
      int num5 = (int) (value / 5);
      value -= num5 * 5;
      int num2 = (int) (value / 2);
      value -= num2 * 2;
      int num1 = (int) (value);
      value -= num1;
      int num050 = (int) (value / 0.50);
      value -= num050 * 0.50;
      int num025 = (int) (value / 0.25);
      value -= num025 * 0.25;
      int num010 = (int) (value / 0.10);
      value -= num010 * 0.10;
      int num005 = (int) (value / 0.05);
      value -= num005 * 0.05;
      int num001 = (int) (value / 0.01);

      // Mostra o resultado das notas
      System.out.println("NOTAS:");
      System.out.println(num100 + " nota(s) de R$ 100.00");
      System.out.println(num50 + " nota(s) de R$ 50.00");
      System.out.println(num20 +" nota(s) de R$ 20.00");
      System.out.println(num10 + " nota(s) de R$ 10.00");
      System.out.println(num5 + " nota(s) de R$ 5.00");
      System.out.println(num2 + " nota(s) de R$ 2.00");

      System.out.println();

      // Mostra o resultado das moedas
      System.out.println("MOEDAS:");
      System.out.println(num1 + " moeda(s) de R$ 1 moedas");
      System.out.println(num050 + " moeda(s) de R$ 0.50 moedas");
      System.out.println(num025 + " moeda(s) de R$ 0.25 moedas");
      System.out.println(num010 + " moeda(s) de R$ 0.10 moedas");
      System.out.println(num005 + " moeda(s) de R$ 0.05 moedas");
      System.out.println(num001 + " moeda(s) de R$ 0.01 moedas");
   }
}

