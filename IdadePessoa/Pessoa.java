package Pessoa;

public class Pessoa {
    
    // Declaração das Variáveis
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;    
    
    // Método Construtor
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    // Método AjustaDataNascimento
    public void ajustaDataNascimento(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
                
    }
    
    // Método CalculaIdade
    public void calculaIdade(){
        
        idade = 2023 - ano;
                       
    }
    
    // Método InformaIdade
    
    public int informaIdade(){
        
        return idade;
        
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome + "I/\nIdade: " + idade + "\nAno de Nascimento: " + ano + "\nMês: " + mes + "\nDia: " + dia;
  }
    
    
}
