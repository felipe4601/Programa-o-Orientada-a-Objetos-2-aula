
public class Main {
    public static void main(String[] args) {
        // Testando os métodos, que acessam os atributos nome e matrcula da
        // classe Aluno
        Aluno aluno1 = new Aluno("Felipe", "2814942");
        Aluno aluno2 = new Aluno("Clara","2343234" );
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());

        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());

        // Testando a classe produto
        Produto produto1 = new Produto("Coca Cola");

        produto1.setPreco(7);

        System.out.println("\n" + produto1.getNome() + " \nValor: R$" + produto1.getPreco());


    }
}