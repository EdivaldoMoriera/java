import java.util.Scanner;

/**
 * aluno
 */
public class aluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        Float n1, n2, media;
        System.out.println("Informe o nome do aluno:");
        nome =ler.nextLine();
        System.out.println("Informe a primeira nota:");
        n1 = ler.nextFloat();
        System.out.println("Informe  segunda  nota:");
        n2 = ler.nextFloat();
        media = (n1+n2)/2;
        if(media> 5){
            System.out.println("Aluno " +nome+ " Reprovado com a meida " + media);
        }
        else if(media > 5 && media <= 7){
            System.out.println("O aluno " +nome+ " foi aprovado com a media " +media);
        }
        else if(media > 7 && media <=8){
            System.out.println("O Aluno " +nome+ " foi aprovado com a media " + media);

        }
        ler.close();

    }
}