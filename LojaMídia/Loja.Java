import Midias.Cds;
import Midias.Dvd;
import Midias.Livros;

public class Loja {

    public static void main(String[] args) {
        
        // Criação dos Objetos
        Dvd dvd1 = new Dvd("Barbie", 10, 90);
        Dvd dvd2 = new Dvd("Ben-10", 10, 90);
        Dvd dvd3 = new Dvd("Homem Aranha", 15, 120);
        Cds cd1 = new Cds("Planet Her", 10, 20);
        Livros livro1 = new Livros("Dom Casmurro", "Machado de Assis", 15);
        
        // Exemplo dos Métodos
        System.out.println("DVD 1:"
                        + "\nNome: " + dvd1.getNomeDVD()
                        + "\nDuração: " + dvd1.getDuracaoMinutos()
                        + "\nPreço: " + dvd1.getPrecoDVD());
        
         System.out.println("\nDVD 2:"
                        + "\nNome: " + dvd2.getNomeDVD()
                        + "\nDuração: " + dvd2.getDuracaoMinutos()
                        + "\nPreço: " + dvd2.getPrecoDVD());
        
          System.out.println("\nDVD 3:"
                        + "\nNome: " + dvd2.getNomeDVD()
                        + "\nDuração: " + dvd2.getDuracaoMinutos()
                        + "\nPreço: " + dvd2.getPrecoDVD());
          
           System.out.println("\nCD 1:"
                        + "\nNome: " + cd1.getNomeCD()
                        + "\nNúmero de Faixas: " + cd1.getNumeroFaixas()
                        + "\nPreço: " + cd1.getPrecoCD());
           
            System.out.println("\nLivro 1:"
                        + "\nNome: " + livro1.getNomeLivro()
                        + "\nAutor: " + livro1.getNomeAutor()
                        + "\nPreço: " + livro1.getPrecoLivro());
        
        
        
        
        
    }
    
}
