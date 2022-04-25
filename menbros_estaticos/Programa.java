package menbros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//formatado com '.' conforme USA
        Scanner ler = new Scanner(System.in);
        Product product = new Product();
        for(int i = 0; i<=2; i++){
        System.out.println("Informe o nome do produto:");
        product.nome = ler.next();
        System.out.println("Informe o preço: ");
        product.preco = ler.nextDouble();
        System.out.println("Informe a quantidade: ");
        product.quantidade = ler.nextInt();
        System.out.println("Nome:" + product.nome + "\nPreco: "+ product.preco + "\nQuantidade em estoque: " +product.quantidade);
        System.out.println("total em estoque R$" + product.totalEmEstoque());
        System.out.println();

        System.out.println("Entre com a quantidade a ser adcionada ao estoque");
        int qtd = ler.nextInt();
        product.addProduto(qtd);
        System.out.println( "novo estoque " +product.quantidade+ " total em estoque R$" +product.totalEmEstoque());
        System.out.println();

        System.out.println("Entre com a quantidade a ser removida  do estoque");
        int qtde = ler.nextInt();
        product.removerProduto(qtde);
        System.out.println( "novo estoque " +product.quantidade+ " total em estoque R$" +product.totalEmEstoque());
        
        System.out.println("*****************");
        System.out.println( product);
        } 
        ler.close();
    }
    
}
