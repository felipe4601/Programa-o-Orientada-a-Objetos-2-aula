public class Bicicleta extends Veiculos{
    private int numeroDeMarchas;


    // Criando método construtor
    public Bicicleta (String marca, int numeroDeMarchas){
        super(marca);// Chama o construtor da classe pai
        this.numeroDeMarchas = numeroDeMarchas;
    }

    // Criando método GETTER
    public int getNumeroDeMarchas(){
        return numeroDeMarchas;
    }



}
