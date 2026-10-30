import java.util.Scanner;
class Produto {
    String titulo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
}
public class Exerclasses {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Produto.p1 = new Produto();
        Produto.p2 = new Produto();
        System.out.println("Digite o título do produto: ");
        Produto.p1.titulo = sc.nextLine();
        System.out.println("Digite a descrição do produto: ");
        Produto.p1.descricao = sc.nextLine();
        System.out.println("Digite o preço unitário do produto: ");
        Produto.p1.precoUnitario = sc.nextDouble();
        System.out.println("Digite a quantidade em estoque do produto: ");
        Produto.p1.qtdEstoque = sc.nextInt();

        System.out.println("Digite o título do produto: ");
        Produto.p2.titulo = sc.nextLine();
        System.out.println("Digite a descrição do produto: ");
        Produto.p2.descricao = sc.nextLine();
        System.out.println("Digite o preço unitário do produto: ");
        Produto.p2.precoUnitario = sc.nextDouble();
        System.out.println("Digite a quantidade em estoque do produto: ");
        Produto.p2.qtdEstoque = sc.nextInt();

        System.out.println("\nInformações do Produto:");
        System.out.println("Título: " + Produto.p1.titulo);
        System.out.println("Descrição: " + Produto.p1.descricao);
        System.out.println("Preço Unitário: R$" + Produto.p1.precoUnitario);
        System.out.println("Quantidade em Estoque: " + Produto.p1.qtdEstoque);
        System.out.println("\nInformações do Produto:");
        System.out.println("Título: " + Produto.p2.titulo);
        System.out.println("Descrição: " + Produto.p2.descricao);
        System.out.println("Preço Unitário: R$" + Produto.p2.precoUnitario);
        System.out.println("Quantidade em Estoque: " + Produto.p2.qtdEstoque);
    }
}
