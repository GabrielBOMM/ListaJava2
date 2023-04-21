package Empregado;

public class Empregado {
    
    // Definição das Variáveis
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    
    // Método Construtor
    public Empregado(String nome, String sobrenome){
        
        this.nome = nome;
        this.sobrenome = sobrenome;
       
    }

    // Definição dos Métodos Get
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    // Definição dos Métodos Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
}
