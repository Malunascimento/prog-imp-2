import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro positivo: ");

    int a = sc.nextInt();
    int i = 1;
    int fatorial= 1;

    while (i <= a){
        fatorial = fatorial * i;
        i++;
    }
    System.out.println(fatorial);

    sc.close();

    }
    }
