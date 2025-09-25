import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private String funcionario;
    private List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(int id, String funcionario) {
        this.id = id;
        this.funcionario = funcionario;
    }

    public void adicionarProduto(Produto p, int qtd) {
        itens.add(new ItemVenda(p, qtd));
        calcularTotal();
    }

    public void calcularTotal() {
        valorTotal = 0;
        for (ItemVenda item : itens) {
            valorTotal += item.getSubtotal();
        }
    }

    public double getValorTotal() { return valorTotal; }

    public void exibirItens() {
        for (ItemVenda item : itens) {
            item.getProduto().exibirDetalhes();
            System.out.println("Quantidade: " + item.getQuantidade() + " | Subtotal: " + item.getSubtotal());
        }
    }
}

