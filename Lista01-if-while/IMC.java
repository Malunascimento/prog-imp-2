import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em kg:");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura em metros:");
        double altura = sc.nextDouble();
    
        double IMC = peso / (altura*altura);
        System.out.printf("%.1f", IMC);

        if(IMC >= 30.0) {
            System.out.print(" Obeso");
        } else if (IMC >= 25.0) { 
              System.out.print(" Sobrepeso");
        } else if (IMC >= 18.5) {
            System.out.print(" Peso normal");
        } else {
            System.out.print(" Abaixo do peso");
        }

    sc.close();
    }
}
