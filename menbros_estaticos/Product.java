package menbros_estaticos;

public class Product {
    String nome;
    Double preco;
    Integer quantidade;
    public double totalEmEstoque(){
        return preco*quantidade;
    }
    public void addProduto(int quantidade){
        this.quantidade +=quantidade;

    }
    public void removerProduto(int quantidade){
        this.quantidade -=quantidade;

    }
    public String toString(){
        return nome 
            + ", $"
            +String.format("%.2f", preco)
            + ", " 
            + quantidade
            + "unidades, Total: $ "
            +String.format("%.2f",totalEmEstoque());
            //classe cpara formatar

    }
    
}
