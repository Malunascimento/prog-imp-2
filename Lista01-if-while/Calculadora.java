import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        
        System.out.println(soma + " ");
        System.out.println(subtracao + " ");
        System.out.println(multiplicacao + " ");

        if(b == 0) {
            System.out.println("Não pode dividir");
        }else {
             int divisao = a / b;
             System.out.println(divisao + " ");
    }
         sc.close();
        
    }
    
}
