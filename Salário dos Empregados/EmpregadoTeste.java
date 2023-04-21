// Aplicação que mostra o salário anual de dois funcionários antes e depois de um aumento
import Empregado.Empregado;

public class EmpregadoTeste {
    
public static void main(String[] args) {
    
    // Criação dos Objetos
    Empregado empregado1 = new Empregado("Maria", "Clara");
    Empregado empregado2 = new Empregado("Lara", "Kalline");
    
    // Set do Salário
    empregado1.setSalarioMensal(5000);
    empregado2.setSalarioMensal(10000);
    
    // Informação do Empregado 1
    System.out.println("Empregado 1:");
    System.out.println("Nome: " + empregado1.getNome());
    System.out.println("Sobrenome: " + empregado1.getSobrenome());
    System.out.println("Salário Mensal: " + empregado1.getSalarioMensal());
    System.out.println("Salário Anual: " + empregado1.getSalarioMensal() * 12);
    System.out.println("Salário Pós-Aumento: " + (empregado1.getSalarioMensal() * 12) * 1.1);
    
    // Informação do Empregado 2
    System.out.println("\nEmpregado 2:");
    System.out.println("Nome: " + empregado2.getNome());
    System.out.println("Sobrenome: " + empregado2.getSobrenome());
    System.out.println("Salário Mensal: " + empregado2.getSalarioMensal());
    System.out.println("Salário Anual: " + empregado2.getSalarioMensal() * 12);
    System.out.println("Salário Pós-Aumento: " + (empregado2.getSalarioMensal() * 12) * 1.1);
    
    
    }
    
}
