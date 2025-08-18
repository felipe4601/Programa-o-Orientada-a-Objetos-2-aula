public class Bicicleta extends Veiculos{
    protected int numeroDeMarchas;

    // Criando método construtor
    public Bicicleta (String marca, int numeroDeMarchas){
        super(marca);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    // Criando método GETTER
    public int getNumeroDeMarchas(){
        return numeroDeMarchas;
    }



}
