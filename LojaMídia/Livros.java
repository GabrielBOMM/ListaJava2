package Midias;

// Classe Livros
public class Livros {
    
    // Declaração das Variáveis
    private String nomeLivro;
    private String nomeAutor;
    private float precoLivro; 
    
    // Método Construtor
    public Livros (String nomeLivro, String nomeAutor, float precoLivro){
        
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.precoLivro = precoLivro;
                    
    }

    // Métodos Get's
    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public float getPrecoLivro() {
        return precoLivro;
    }
    
    
    
}


