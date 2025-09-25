public class ItemVenda {
        private Produto produto;
        private double subtotal;
        private int quantidade;
    
        public ItemVenda(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.subtotal = calcularSubtotal();
        }
    
        public double calcularSubtotal() {
            return produto.getPreco() * quantidade;
        }
    
        public Produto getProduto() { return produto; }
        public double getSubtotal() { return subtotal; }
        public int getQuantidade() { return quantidade;}
    }
