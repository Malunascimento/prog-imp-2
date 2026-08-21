import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário:");
        double bruto = sc.nextDouble();
        double contribuicao;
        double salarioliquido;
    
        if(bruto <= 1621) {
            contribuicao = bruto * 0.75;
            salarioliquido = bruto - contribuicao;
     
        } else if (bruto <= 2902.84) {
            contribuicao = bruto * 0.09 - 24.32;
            salarioliquido = bruto - contribuicao;
        
        }else if (bruto <= 4354.27) {
            contribuicao = bruto * 0.12 - 111.40;
            salarioliquido = bruto - contribuicao;
          
        }else if (bruto <= 8475.55) {
            contribuicao = bruto * 0.14 - 198.49;
            salarioliquido = bruto - contribuicao;
        

           System.out.printf("Sua contribuição é de: %.2f Seu salário líquido é: %.2f%n", contribuicao, salarioliquido);
          
        }
         sc.close();
        }
    
}
