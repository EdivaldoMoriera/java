package estrutura_de_repeticao;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
      //  
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        for(int i = 0; i<=2; i++){
            System.out.println("Informe o nome do produto:");
            produto.nome = scanner.next();
           // scanner.next();
            System.out.println("Informe o preco do produto: ");
            produto.preco = scanner.nextDouble();
            System.out.println("Informe a quantidade: ");
            produto.quantidade = scanner.nextInt();

            System.out.println("Nome:"  + produto.nome + "\nPreco: " + produto.preco + "\nQuantidade: " +produto.quantidade);

        }
        scanner.close();
    }
    
}
