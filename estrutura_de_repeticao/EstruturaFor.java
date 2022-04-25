package estrutura_de_repeticao;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<=2; i++){
            System.out.println("informe seu nome:");
            nome = scanner.nextLine();
            System.out.println("Seu nome é: " +nome);

        }
        scanner.close();
    }
    
}
