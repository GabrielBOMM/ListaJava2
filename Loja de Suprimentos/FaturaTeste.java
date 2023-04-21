// Bibliotecas
import Fatura.Fatura;
import java.util.Scanner;

// Aplicação que Mostra as Capacidades da Classe Fatura
public class FaturaTeste {

    public static void main(String[] args) {
         
        // Criação do Objeto 1
        Fatura fatura1 = new Fatura("1", "Computador", 50, 10000 );
        
        // Objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Teste do Método Fatura
        System.out.println("Variáveis: ");
        System.out.println(fatura1.getDescricaoItem());
        System.out.println(fatura1.getNumeroItem());
        System.out.println(fatura1.getQuantidadeItem());
        System.out.println(fatura1.getPrecoItem());
        System.out.println(fatura1.getTotalFatura()); //Teste 1 do Método getTotalFatura
        
        // Criação do Objeto 2
        Fatura fatura2 = new Fatura();
        
        // Teste dos Set's
        System.out.println("\nDigite o número do item: ");
        String numeroItem = sc.nextLine();
        fatura2.setNumeroItem(numeroItem);
        System.out.println("Digite a descrição do item: ");
        String descricaoItem = sc.nextLine();
        fatura2.setDescricaoItem(descricaoItem);
        System.out.println("Digite a quantidade de itens: ");
        int quantidadeItem = sc.nextInt();
        fatura2.setQuantidadeItem(quantidadeItem);
        System.out.println("Digite o preco do item: ");
        double precoItem = sc.nextDouble();
        fatura2.setPrecoItem(precoItem);
        
        // Teste dos Get's
        System.out.println("\nVariáveis 2:");
        System.out.println("O número do item é: " + fatura2.getNumeroItem());
        System.out.println("A descrição do item é: " + fatura2.getDescricaoItem());
        System.out.println("A quantidade de itens é: " + fatura2.getQuantidadeItem());
        System.out.println("O preço do item é é: " + fatura2.getPrecoItem());
        System.out.println("A fatura total é: " + fatura2.getTotalFatura());
        
        
        
    }
    
}
