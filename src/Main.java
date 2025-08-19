
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
        System.out.println();
        produto1.setPreco(7);
        produto1.setPreco(-10);

        System.out.println(produto1.getNome() + " \nValor: R$" + produto1.getPreco());

        // Testando herança de classes
        Atleta jogador = new Atleta("Felipe", "Futebol");

        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Esporte: " + jogador.getEsporte());

        // Usando as heranças da classe Veiculos
        Carro meuCarro = new Carro("Ford", 4);
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", 18);

        System.out.println("Carro: " + meuCarro.getMarca() + " com " + meuCarro.getNumeroDePortas()
        + " portas.");
        System.out.println("Bicicleta: " + minhaBicicleta.getMarca() + " com " + minhaBicicleta.getNumeroDeMarchas()
        + " marchas.");

        //Exercício 3 Funcionário e Gerente
        Gerente chefe = new Gerente("Felipe", 8000,"Arquito de Software");
        System.out.println("Nome: " + chefe.getNome());
        System.out.println("Salário: " + chefe.getSalario());
        System.out.println("Departamento: " + chefe.getDepartamento());


        // Exercício 4 Produto e livro
        Livro meuLivro = new Livro("A Arte da Guerra", 29.99, "Sun Tzu");
        meuLivro.exibirDetalhes();


    }
}