import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário:");
        double bruto = sc.nextDouble();
        double imposto;

        if(bruto <= 2428.80) {
            imposto = 0;
     
        } else if (bruto <= 2826.65) {
            imposto = bruto * 0.075 - 182.16;
        
        }else if (bruto <= 3751.05) {
            imposto = bruto * 0.15 - 394.16;
          
        }else if (bruto <= 4664.68) {
            imposto = bruto * 0.225 - 675.49;
        } else {
          imposto = bruto * 0.275 - 908.73;

           System.out.printf("Seu imposto de renda é: %.2f Seu salário líquido é: %.2f%n", imposto);
        }
        sc.close();
        }
    }

    