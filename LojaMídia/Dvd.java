package Midias;

// Classe CDS
public class Cds {
    
    // Declaração Variáveis
    private String nomeCD;
    private int numeroFaixas;
    private float precoCD; 
    
    // Método Construtor
    public Cds (String nomeCD, int numeroFaixas, float precoCD){
        
        this.nomeCD = nomeCD;
        this.numeroFaixas = numeroFaixas;
        this.precoCD = precoCD;
                    
    }

    // Métodos Get's
    public String getNomeCD() {
        return nomeCD;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public float getPrecoCD() {
        return precoCD;
    }
    
    
}
