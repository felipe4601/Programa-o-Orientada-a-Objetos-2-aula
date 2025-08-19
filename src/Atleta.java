public class Atleta extends Pessoa{
    private String esporte;

    // Iniciando Construtor
    public Atleta(String nome, String esporte){
        super(nome); // Chama o construtor da superclasse
        this.esporte = esporte; // construtor da classe filha
    }

    // Criando GETTERS
    public String getEsporte(){
        return esporte;
    }
}
