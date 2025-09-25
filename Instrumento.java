public class Instrumento extends Produto {
    private String tipo;
    private String marca;

    public Instrumento(int codigo, String nome, double preco, String tipo, String marca) {
        super(codigo, nome, preco); // chamada correta do construtor da superclasse
        this.tipo = tipo;
        this.marca = marca;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Instrumento: " + getNome() + " | Tipo: " + tipo + " | Marca: " + marca +" | Preço: " + getPreco());
    }
}

