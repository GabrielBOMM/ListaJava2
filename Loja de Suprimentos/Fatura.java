package Fatura;

public class Fatura {
    
    // Definição das Variáveis
    private String numeroItem;
    private String descricaoItem;
    private int quantidadeItem;
    private double precoItem;
    private double totalFatura;
   
    
    // Definição do Método Construtor
    public Fatura(String numeroItem, String descricaoItem, int quantidadeItem, double precoItem){
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;
        
    }
    
    // Método Construtor sem Parâmetro
    public Fatura(){
        
    }

    // Definição dos Get's
    public String getNumeroItem() {
        return numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    // Definição dos Set's
    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    // Método getTotalFatura
    public double getTotalFatura(){
        
        if(precoItem < 0){
            
            precoItem = 0.0;
            
        }
        
        totalFatura = quantidadeItem * precoItem;
        
        if(totalFatura < 0){
            
            totalFatura = 0;
            
        }
        
        return totalFatura;
    }
    
    
}
