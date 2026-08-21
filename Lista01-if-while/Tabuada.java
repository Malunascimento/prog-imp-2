import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um número: ");
         
         int n = sc.nextInt();
         int i = 1;
         int multiplicacao=1;
      
         while (i <= 10) {
            multiplicacao = n * i;
            System.out.println(n + " x " + i + " = " + multiplicacao);
            i++;
            
            sc.close();
         }
    }
}