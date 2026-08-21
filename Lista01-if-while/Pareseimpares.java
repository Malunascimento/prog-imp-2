import java.util.Scanner;

public class Pareseimpares {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite dois números:");

    int a = sc.nextInt();
    int b = sc.nextInt();

    int menor;
    int maior;

    if(a < b){
        menor = a;
        maior = b;
    } else {
        menor = b;
        maior = a;

    }
    int i = menor;
     while(i <= maior){
        if(i % 2 == 0){
             System.out.println(i);
     }
     i++;
    }

     i = menor;
        while (i <= maior) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

     sc.close();

}
}
