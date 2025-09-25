public class Acessorio extends Produto {
    private String material;

    public Acessorio(int codigo, String nome, double preco, String material) {
        super(codigo, nome, preco); 
        this.material = material;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Acessório: " + getNome() +
                " | Material: " + material +
                " | Preço: " + getPreco());
    }
}
